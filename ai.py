import os
import time
from enum import IntEnum

import numpy as np
import matplotlib.pyplot as plt
import tensorflow as tf
from tensorflow.keras.models import Model
from tensorflow.keras.layers import Dense
from tensorflow.keras.callbacks import Callback
from sklearn.model_selection import KFold
from sklearn import metrics
from sklearn.model_selection import train_test_split

from readfiles import readdir, fileFactory, get_example_files 
from tokenizer import TokenType, PreParser, Parser


class labels(IntEnum):
    truePositive  = 0
    falsePositive = 1

fp_dir = './FalsePositive'
tp_dir = './TruePositive'

tp_file_names = readdir(tp_dir)
fp_file_names = readdir(fp_dir)

print(tp_file_names)
print(fp_file_names)

tp_files = list()
fp_files = list()

for f in tp_file_names:   
    tp_files.append( fileFactory(f, tp_dir, labels.truePositive) );
   
for f in fp_file_names:   
    fp_files.append( fileFactory(f, fp_dir, labels.falsePositive) );
print(len(tp_files))
print(len(fp_files))


def generateTokensFromFile(file_path):
    tokens = []
    with PreParser(file_path) as preparser:
        preparser.parse()
        with Parser( preparser.get_result() ) as parser:
            parser.parse()
            for value in parser.get_result():
                tokens.append(value)
    return tokens

def create_counter_dictionary():
    counter_dict = {};
    for tokenType in TokenType: 
        counter_dict[tokenType.name] = 0
    return counter_dict; 

def create_unique_vocabulary(tokens):
    result = []
    for token in tokens:
        if (all(result_token.value != token.value for result_token in result)):
            result.append(token)
    return result

def create_vocabulary_with_weights(tokens, counter_dict, dictionary):
    result = {}; 
    vocabulary_without_weights = create_unique_vocabulary(tokens)

        
    for unique_token in vocabulary_without_weights: 
        if (any(unique_token == token for token in dictionary)):
            continue; 
        
        if (unique_token.type != TokenType.Comment):
            counter_dict[unique_token.type.name] += 1; 
        result[unique_token] = counter_dict[unique_token.type.name] + int(unique_token.type)
    return result

def createVectorFromTokens(tokens, vocabulary_with_weights):
    vector = []
    for token in tokens:
        vector.append(vocabulary_with_weights[token])
    return vector

def createVectorFromFileAndUpdateDict(file_path, dictionary, counter_dictionary):
    tokens = generateTokensFromFile(file_path)
    dictionary.update( create_vocabulary_with_weights(tokens, counter_dictionary, dictionary))
    vector = createVectorFromTokens(tokens, dictionary)
    return vector, dictionary

def get_model(vocab_size, len): 
    initializer = tf.keras.initializers.GlorotNormal()
    regularizer = tf.keras.regularizers.L1L2(l1=1e-5, l2=1e-4)
    model = tf.keras.Sequential();
    model.add(tf.keras.layers.Embedding(input_dim=vocab_size+1, output_dim=128, input_length=len))
    model.add(tf.keras.layers.LSTM(128, return_sequences=True, kernel_initializer=initializer, kernel_regularizer=regularizer))
    model.add(tf.keras.layers.Dropout(0.3))
    model.add(tf.keras.layers.LSTM(64, return_sequences=True, kernel_initializer=initializer, kernel_regularizer=regularizer))
    model.add(tf.keras.layers.Dropout(0.3))
    model.add(tf.keras.layers.LSTM(32, return_sequences=True, kernel_initializer=initializer, kernel_regularizer=regularizer))
    model.add(tf.keras.layers.Dropout(0.3))
    model.add(tf.keras.layers.LSTM(16, return_sequences=False, kernel_initializer=initializer, kernel_regularizer=regularizer))
    model.add(tf.keras.layers.Dropout(0.3))
    model.add(tf.keras.layers.Dense(16, activation='relu', kernel_initializer=initializer, kernel_regularizer=regularizer))
    model.add(tf.keras.layers.Dropout(0.3))
    model.add(tf.keras.layers.Dense(1, activation='sigmoid', kernel_initializer=initializer, kernel_regularizer=regularizer))
    model.compile(optimizer='adam', loss='binary_crossentropy', metrics=['accuracy'])
    return model

def modelFit(X, y, voc, epochs, checkpoint_path, part):
    X = tf.keras.preprocessing.sequence.pad_sequences(X, padding='pre', value=-1)
    X = np.array(X)
    y = np.array(y)

    if (os.path.exists(checkpoint_path)):
        os.remove(checkpoint_path)

    model_checkpoint_callback = tf.keras.callbacks.ModelCheckpoint(
    filepath=checkpoint_path,
    save_weights_only=True,
    monitor='val_loss',
    mode='min',
    save_best_only=True)
    
    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=part)
    model = get_model(len(voc), X.shape[1])
    
    history = model.fit(X_train, y_train, epochs=epochs, validation_data=(X_test, y_test), callbacks=[model_checkpoint_callback])
    
    plt.plot(history.history['val_accuracy'], label="val_accuracy")
    plt.plot(history.history['val_loss'], label="val_loss")
    
    plt.legend()
    plt.show()
    return X_train, X_test, y_train, y_test, model

def cheater_cross_validation(n_splits, X, y, vocabulary, epochs):
    X = tf.keras.preprocessing.sequence.pad_sequences(X, padding='pre', value=-1)
    X = np.array(X)
    y = np.array(y)
    random_ = 42
    cv = KFold(n_splits=n_splits, shuffle=True, random_state=random_)

    y_real = []
    X_real = []
    y_pred = []
    for fold, (train_index, test_index) in enumerate(cv.split(X, y)):
        print(f"Fold #{fold}")     
        train_x = X[train_index]
        train_y = y[train_index]  
        test_x = X[test_index]
        test_y = y[test_index] 
        checkpoint_filepath = f"./model/cross/checkpointTokenizer#{fold}.weights.h5"
        _, _, _, _, model = modelFit(train_x, train_y, vocabulary, epochs, checkpoint_filepath, 0.1)
        model.load_weights(checkpoint_filepath)
        predictions = model.predict(test_x)
        X_real.extend(test_x)
        y_real.extend(test_y)
        y_pred.extend(predictions)
    return X_real, y_real, y_pred

def loadModel(weight_file, vocabulary_size, shape):
    model = get_model(vocabulary_size, shape)
    l = []
    l.append(list(np.zeros(shape)))
    l = np.array(l)
    model.predict(l)
    model.load_weights(weight_file)
    return model

#Преобразование вероятности в класс
def getClassFromBinaryClassification(value, thresh): 
    if (value > thresh): 
        return 1
    else:
        return 0

#Вычисление параметра точности
def findAccuracy(y_real, y_pred):
    TP = 0;
    TN = 0; 
    FP = 0; 
    FN = 0;
    for i in range(len(y_real)):
        if (y_real[i] == 1):
            if (y_real[i] == y_pred[i]): 
                TP+=1; 
            else: 
                FP+=1; 
        else:
            if (y_real[i] == y_pred[i]): 
                TN+=1; 
            else: 
                FN+=1; 
    print("TP: ", TP, " TN: ", TN, " FP: ", FP, " FN: ", FN)
    return (TP + TN) / (TP + TN + FP + FN);

#Вывод информации о точности модели, вывод реальных значений классов и распознаных
def printResults(y_pred, thresh, y_real):
    y_pred_class = [getClassFromBinaryClassification(value, thresh) for value in y_pred]
    print("Accuracy: ", findAccuracy(y_real, y_pred_class) * 100, "%")
    for i in range(len(y_pred_class)):
        print("[" + str(i) + "]:" , y_real[i], "-", y_pred_class[i])

counter_dictionary = create_counter_dictionary()
vocabulary = dict()
X = []
y = []

for file in tp_files:
    vector, vocabulary = createVectorFromFileAndUpdateDict(file.path, vocabulary, counter_dictionary)
    X.append(vector)
    y.append(int(file.label))
    
for file in fp_files:
    vector, vocabulary = createVectorFromFileAndUpdateDict(file.path, vocabulary, counter_dictionary)
    X.append(vector)
    y.append(int(file.label))

EPOCHS = 30
batch_size = 2
checkpoint_path = "./model/checkpointTokenizer.weights.h5"
enumerated_dictionary = {}

for token, value in vocabulary.items():
    enumerated_dictionary[token.value] = value

voc = max(enumerated_dictionary.values())
new_vocabulary = []
for i in range(voc):
    for key, value in enumerated_dictionary.items():
        isAdded = False
        if (i == value):
            new_vocabulary.append(key)
            isAdded = True
            break;
    if (isAdded == False):
        new_vocabulary.append("")
counter = 0;
for value in new_vocabulary:
    if (value != ""):
        counter+=1
print(counter)
print(len(new_vocabulary))

x_train, x_test, y_train, y_test, _ = modelFit(X, y, new_vocabulary, EPOCHS, checkpoint_path, 0.1)

X = tf.keras.preprocessing.sequence.pad_sequences(X, padding='pre', value=-1)
X = np.array(X)
model = loadModel(checkpoint_path, len(new_vocabulary), X.shape[1])
y_pred = model.predict(X)
y_real = y
printResults(y_pred, 0.5, y_real)


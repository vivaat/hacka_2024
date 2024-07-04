public class CharClass3 {

    char charField;
    Object objectField;
    char someChar;

    public boolean compare(CharClass1 anotherObject) {
        if (someChar == anotherObject.someChar)
            return true;
        if (objectField == anotherObject.objectField)
            return true;
        if (charField == anotherObject.charField)
            return true;
        else
            return false;
    }
}

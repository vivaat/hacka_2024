public class FloatClass3 {

    float floatField;
    Object objectField;
    float someFloat;

    public boolean compare(FloatClass1 anotherObject) {
        if (someFloat == anotherObject.someFloat)
            return true;
        if (objectField == anotherObject.objectField)
            return true;
        if (floatField == anotherObject.floatField)
            return true;
        else
            return false;
    }
}

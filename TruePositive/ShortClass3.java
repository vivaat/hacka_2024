public class ShortClass3 {

    short shortField;
    Object objectField;
    short someShort;

    public boolean compare(ShortClass1 anotherObject) {
        if (someShort == anotherObject.someShort)
            return true;
        if (objectField == anotherObject.objectField)
            return true;
        if (shortField == anotherObject.shortField)
            return true;
        else
            return false;
    }
}

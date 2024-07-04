public class IntClass3 {

    int intField;
    Object objectField;
    int someInt;

    public boolean compare(IntClass1 anotherObject) {
        if (someInt == anotherObject.someInt)
            return true;
        if (objectField == anotherObject.objectField)
            return true;
        if (intField == anotherObject.intField)
            return true;
        else
            return false;
    }
}

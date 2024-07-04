public class LongClass3 {

    long longField;
    Object objectField;
    long someLong;

    public boolean compare(LongClass1 anotherObject) {
        if (someLong == anotherObject.someLong)
            return true;
        if (objectField == anotherObject.objectField)
            return true;
        if (longField == anotherObject.longField)
            return true;
        else
            return false;
    }
}

public class DoubleClass3 {

    double doubleField;
    Object objectField;
    double someDouble;

    public boolean compare(DoubleClass1 anotherObject) {
        if (someDouble == anotherObject.someDouble)
            return true;
        if (objectField == anotherObject.objectField)
            return true;
        if (doubleField == anotherObject.doubleField)
            return true;
        else
            return false;
    }
}

public class DoubleClass1 {

    Object someObject;
    double doubleValue;

    public boolean check(DoubleClass1 anotherObject) {
        if (doubleValue == anotherObject.doubleValue && someObject == anotherObject.someObject)
            return true;
        else
            return false;
    }
}

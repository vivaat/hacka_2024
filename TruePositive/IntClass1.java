public class IntClass1 {

    Object someObject;
    int intValue;

    public boolean check(IntClass1 anotherObject) {
        if (intValue == anotherObject.intValue && someObject == anotherObject.someObject)
            return true;
        else
            return false;
    }
}

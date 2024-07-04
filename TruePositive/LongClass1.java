public class LongClass1 {

    Object someObject;
    long longValue;

    public boolean check(LongClass1 anotherObject) {
        if (longValue == anotherObject.longValue && someObject == anotherObject.someObject)
            return true;
        else
            return false;
    }
}

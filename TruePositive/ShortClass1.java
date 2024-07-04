public class ShortClass1 {

    Object someObject;
    short shortValue;

    public boolean check(ShortClass1 anotherObject) {
        if (shortValue == anotherObject.shortValue && someObject == anotherObject.someObject)
            return true;
        else
            return false;
    }
}

public class FloatClass1 {

    Object someObject;
    float floatValue;

    public boolean check(FloatClass1 anotherObject) {
        if (floatValue == anotherObject.floatValue && someObject == anotherObject.someObject)
            return true;
        else
            return false;
    }
}

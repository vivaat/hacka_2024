public class ByteClass1 {

    Object someObject;
    byte byteValue;

    public boolean check(ByteClass1 anotherObject) {
        if (byteValue == anotherObject.byteValue && someObject == anotherObject.someObject)
            return true;
        else
            return false;
    }
}

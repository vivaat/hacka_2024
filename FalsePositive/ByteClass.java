public class ByteClass {

    Object someObject;
    byte data;

    public boolean isEqual(ByteClass anotherObject) {
        if (data == anotherObject.data || someObject == anotherObject.someObject)
            return true;
        if (data == anotherObject.data || anotherObject.someObject.equals(someObject))
            return true;
        else
            return false;
    }
}

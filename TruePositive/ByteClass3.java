public class ByteClass3 {

    byte byteField;
    Object objectField;
    byte someByte;

    public boolean compare(ByteClass1 anotherObject) {
        if (someByte == anotherObject.someByte)
            return true;
        if (objectField == anotherObject.objectField)
            return true;
        if (byteField == anotherObject.byteField)
            return true;
        else
            return false;
    }
}

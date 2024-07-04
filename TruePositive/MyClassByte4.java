public class MyClassByte4 {

    Object obj1;
    byte byteField;

    public boolean areFieldsEqual(MyClassByte4 otherObject) {
        if (byteField == otherObject.byteField && obj1 == otherObject.obj1)
            return true;
        else
            return false;
    }
}

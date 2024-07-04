public class ByteComparasion5 {

    Object object1;
    byte byteVariable;

    public boolean compare(ByteComparison5 someOtherObject) {
        if (byteVariable == someOtherObject.byteVariable && object1 == someOtherObject.object1)
            return true;
        else
            return false;
    }
}

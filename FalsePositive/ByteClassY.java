public class ByteClassY {

    byte numberB;
    byte otherNumberB;

    public boolean isEqual(ByteClassY someOtherObject) {
        return numberB == someOtherObject.numberB && otherNumberB == someOtherObject.otherNumberB;
    }
}

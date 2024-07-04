public class LongHolderT {

    long valueT;
    long anotherValueT;

    public boolean areEqual(LongHolderT someOtherObject) {
        return valueT == someOtherObject.valueT && anotherValueT == someOtherObject.anotherValueT;
    }
}

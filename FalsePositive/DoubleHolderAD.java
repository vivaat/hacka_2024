public class DoubleHolderAD {

    double valueAD;
    double anotherValueAD;

    public boolean areEqual(DoubleHolderAD someOtherObject) {
        return valueAD == someOtherObject.valueAD && anotherValueAD == someOtherObject.anotherValueAD;
    }
}

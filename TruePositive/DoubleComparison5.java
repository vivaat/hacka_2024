public class DoubleComparison5 {

    Object object1;
    double doubleVariable;

    public boolean compare(DoubleComparison5 someOtherObject) {
        if (doubleVariable == someOtherObject.doubleVariable && object1 == someOtherObject.object1)
            return true;
        else
            return false;
    }
}

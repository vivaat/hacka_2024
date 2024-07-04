public class LongComparison5 {

    Object object1;
    long longVariable;

    public boolean compare(LongComparison5 someOtherObject) {
        if (longVariable == someOtherObject.longVariable && object1 == someOtherObject.object1)
            return true;
        else
            return false;
    }
}

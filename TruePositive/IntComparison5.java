public class IntComparison5 {

    Object object1;
    int intVariable;

    public boolean compare(IntComparison5 someOtherObject) {
        if (intVariable == someOtherObject.intVariable && object1 == someOtherObject.object1)
            return true;
        else
            return false;
    }
}

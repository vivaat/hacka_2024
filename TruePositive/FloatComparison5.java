public class FloatComparison5 {

    Object object1;
    float floatVariable;

    public boolean compare(FloatComparison5 someOtherObject) {
        if (floatVariable == someOtherObject.floatVariable && object1 == someOtherObject.object1)
            return true;
        else
            return false;
    }
}

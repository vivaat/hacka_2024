public class ShortComparison5 {

    Object object1;
    short shortVariable;

    public boolean compare(ShortComparison5 someOtherObject) {
        if (shortVariable == someOtherObject.shortVariable && object1 == someOtherObject.object1)
            return true;
        else
            return false;
    }
}

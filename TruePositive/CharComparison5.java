public class CharComparison5 {

    Object object1;
    char charVariable;

    public boolean compare(CharComparison5 someOtherObject) {
        if (charVariable == someOtherObject.charVariable && object1 == someOtherObject.object1)
            return true;
        else
            return false;
    }
}

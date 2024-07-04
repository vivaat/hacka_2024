public class AnotherExample5 {

    Object object1;
    int integerField;

    public boolean areFieldsEqual(AnotherExample5 someOtherObject) {
        if (integerField == someOtherObject.integerField && object1 == someOtherObject.object1)
            return true;
        else
            return false;
    }
}

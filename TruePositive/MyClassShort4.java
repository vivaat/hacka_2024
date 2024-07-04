public class MyClassShort4 {

    Object obj1;
    short shortField;

    public boolean areFieldsEqual(MyClassShort4 otherObject) {
        if (shortField == otherObject.shortField && obj1 == otherObject.obj1)
            return true;
        else
            return false;
    }
}

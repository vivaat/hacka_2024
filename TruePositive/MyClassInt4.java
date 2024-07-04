public class MyClassInt4 {

    Object obj1;
    int intField;

    public boolean areFieldsEqual(MyClassInt4 otherObject) {
        if (intField == otherObject.intField && obj1 == otherObject.obj1)
            return true;
        else
            return false;
    }
}

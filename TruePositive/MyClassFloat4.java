public class MyClassFloat4 {

    Object obj1;
    float floatField;

    public boolean areFieldsEqual(MyClassFloat4 otherObject) {
        if (floatField == otherObject.floatField && obj1 == otherObject.obj1)
            return true;
        else
            return false;
    }
}

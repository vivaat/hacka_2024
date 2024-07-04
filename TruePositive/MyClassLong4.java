public class MyClassLong4 {

    Object obj1;
    long longField;

    public boolean areFieldsEqual(MyClassLong4 otherObject) {
        if (longField == otherObject.longField && obj1 == otherObject.obj1)
            return true;
        else
            return false;
    }
}

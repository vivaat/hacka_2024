public class MyClassDouble4 {

    Object obj1;
    double doubleField;

    public boolean areFieldsEqual(MyClassDouble4 otherObject) {
        if (doubleField == otherObject.doubleField && obj1 == otherObject.obj1)
            return true;
        else
            return false;
    }
}

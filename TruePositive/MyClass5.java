public class MyClass5 {

    Object obj1;
    char charField;

    public boolean areFieldsEqual(MyClassChar4 otherObject) {
        if (charField == otherObject.charField && obj1 == otherObject.obj1)
            return true;
        else
            return false;
    }
}

public class MyClass4 {

    Object obj1;
    int value;

    public boolean compareObjects(MyClass4 otherObject) {
        if (value == otherObject.value && obj1 == otherObject.obj1)
            return true;
        else
            return false;
    }
}

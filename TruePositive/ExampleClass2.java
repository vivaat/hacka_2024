public class ExampleClass2 {

    Object objField1;
    int intValue;

    public boolean isEqual(ExampleClass2 otherInstance) {
        if (intValue == otherInstance.intValue && objField1 == otherInstance.objField1)
            return true;
        else
            return false;
    }
}

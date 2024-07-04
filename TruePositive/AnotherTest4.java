public class AnotherTest4 {

    Object field1;
    Object field2;

    public boolean wow(AnotherTest4 otherInstance) {
        if (field1 != otherInstance.field1 || field2 != otherInstance.field2)
            return false;
        else
            return true;
    }
}

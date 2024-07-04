public class ExampleShort2 {

    Object objectA;
    short valueB;

    public boolean isEqual(ExampleShort2 otherInstance) {
        if (valueB == otherInstance.valueB && objectA == otherInstance.objectA)
            return true;
        else
            return false;
    }
}

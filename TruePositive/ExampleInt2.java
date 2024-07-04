public class ExampleInt2 {

    Object objectA;
    int valueB;

    public boolean isEqual(ExampleInt2 otherInstance) {
        if (valueB == otherInstance.valueB && objectA == otherInstance.objectA)
            return true;
        else
            return false;
    }
}

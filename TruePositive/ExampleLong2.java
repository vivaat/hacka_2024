public class ExampleLong2 {

    Object objectA;
    long valueB;

    public boolean isEqual(ExampleLong2 otherInstance) {
        if (valueB == otherInstance.valueB && objectA == otherInstance.objectA)
            return true;
        else
            return false;
    }
}

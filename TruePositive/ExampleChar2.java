public class ExampleChar2 {

    Object objectA;
    char valueB;

    public boolean isEqual(ExampleChar2 otherInstance) {
        if (valueB == otherInstance.valueB && objectA == otherInstance.objectA)
            return true;
        else
            return false;
    }
}

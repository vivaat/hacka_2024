public class ExampleFloat2 {

    Object objectA;
    float valueB;

    public boolean isEqual(ExampleFloat2 otherInstance) {
        if (valueB == otherInstance.valueB && objectA == otherInstance.objectA)
            return true;
        else
            return false;
    }
}

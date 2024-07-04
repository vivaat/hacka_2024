public class ExampleDouble2 {

    Object objectA;
    double valueB;

    public boolean isEqual(ExampleDouble2 otherInstance) {
        if (valueB == otherInstance.valueB && objectA == otherInstance.objectA)
            return true;
        else
            return false;
    }
}

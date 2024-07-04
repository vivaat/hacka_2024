public class ByteExample2 {

    Object objectA;
    byte valueB;

    public boolean isEqual(ByteExample2 otherInstance) {
        if (valueB == otherInstance.valueB && objectA == otherInstance.objectA)
            return true;
        else
            return false;
    }
}

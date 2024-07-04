public class Example4 {

    Object field1;
    Object field2;

    public boolean areEqual(Example4 otherInstance) {
        return field1 == otherInstance.field1 && field2 == otherInstance.field2;
    }
}

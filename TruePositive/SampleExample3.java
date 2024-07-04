public class SampleExample3 {

    Object fieldA;
    Object fieldB;

    public boolean isEqual(SampleExample3 otherInstance) {
        return fieldA == otherInstance.fieldA || fieldB == otherInstance.fieldB;
    }
}

public class TestDouble3 {

    Object fieldA;
    double fieldB;

    public boolean compareObjects(TestDouble3 anotherObject) {
        if (fieldB == anotherObject.fieldB && fieldA == anotherObject.fieldA)
            return true;
        else
            return false;
    }
}

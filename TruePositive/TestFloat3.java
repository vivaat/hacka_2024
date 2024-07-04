public class TestFloat3 {

    Object fieldA;
    float fieldB;

    public boolean compareObjects(TestFloat3 anotherObject) {
        if (fieldB == anotherObject.fieldB && fieldA == anotherObject.fieldA)
            return true;
        else
            return false;
    }
}

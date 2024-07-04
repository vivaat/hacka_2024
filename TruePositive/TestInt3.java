public class TestInt3 {

    Object fieldA;
    int fieldB;

    public boolean compareObjects(TestInt3 anotherObject) {
        if (fieldB == anotherObject.fieldB && fieldA == anotherObject.fieldA)
            return true;
        else
            return false;
    }
}

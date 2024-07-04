public class TestLong3 {

    Object fieldA;
    long fieldB;

    public boolean compareObjects(TestLong3 anotherObject) {
        if (fieldB == anotherObject.fieldB && fieldA == anotherObject.fieldA)
            return true;
        else
            return false;
    }
}

public class TestByte3 {

    Object fieldA;
    byte fieldB;

    public boolean compareObjects(TestByte3 anotherObject) {
        if (fieldB == anotherObject.fieldB && fieldA == anotherObject.fieldA)
            return true;
        else
            return false;
    }
}

public class TestChar3 {

    Object fieldA;
    char fieldB;

    public boolean compareObjects(TestChar3 anotherObject) {
        if (fieldB == anotherObject.fieldB && fieldA == anotherObject.fieldA)
            return true;
        else
            return false;
    }
}

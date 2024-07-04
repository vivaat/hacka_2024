public class TestShort3 {

    Object fieldA;
    short fieldB;

    public boolean compareObjects(TestShort3 anotherObject) {
        if (fieldB == anotherObject.fieldB && fieldA == anotherObject.fieldA)
            return true;
        else
            return false;
    }
}

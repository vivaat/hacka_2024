public class TaskObject3 {

    Object fieldA;
    int fieldB;

    public boolean checkEquality(TestObject3 anotherObject) {
        if (fieldB == anotherObject.fieldB && fieldA == anotherObject.fieldA)
            return true;
        else
            return false;
    }
}

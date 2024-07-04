public class TestClassA {

    Object fieldA;

    public boolean isEqual(TestClassA otherA) {
        if(fieldA == otherA.fieldA)
            return true;
        else if(!(fieldA.equals(otherA.fieldA)))
            return false;
        else
            return false;
    }
}

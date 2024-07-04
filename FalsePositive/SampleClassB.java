public class SampleClassB {

    Object fieldB;

    public boolean checkEquality(SampleClassB anotherB) {
        if(fieldB == anotherB.fieldB)
            return true;
        else if(!(fieldB.equals(anotherB.fieldB)))
            return false;
        else
            return false;
    }
}

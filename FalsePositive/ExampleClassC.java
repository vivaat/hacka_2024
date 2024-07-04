public class ExampleClassC {

    Object fieldC;

    public boolean areEqual(ExampleClassC otherC) {
        if(fieldC == otherC.fieldC)
            return true;
        else if(!(fieldC.equals(otherC.fieldC)))
            return false;
        else
            return false;
    }
}

public class DemoClassD {

    Object fieldD;

    public boolean isSame(DemoClassD anotherD) {
        if(fieldD == anotherD.fieldD)
            return true;
        else if(!(fieldD.equals(anotherD.fieldD)))
            return false;
        else
            return false;
    }
}

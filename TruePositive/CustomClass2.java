public class CustomClass2 {

    Object valueA;
    Object valueB;

    public boolean check(CustomClass2 otherObject) {
        if (valueA != otherObject.valueA || valueB != otherObject.valueB)
            return false;
        else
            return true;
    }
}

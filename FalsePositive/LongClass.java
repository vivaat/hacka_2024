public class LongClass {

    Object otherObject;
    long value;

    public boolean check(LongClass someObject) {
        if (value == someObject.value || otherObject == someObject.otherObject)
            return true;
        if (value == someObject.value || someObject.otherObject.equals(otherObject))
            return true;
        else
            return false;
    }
}

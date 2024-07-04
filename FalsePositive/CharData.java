public class CharData {

    Object someObject;
    char value;

    public boolean areEqual(CharData otherObject) {
        if (value == otherObject.value || someObject == otherObject.someObject)
            return true;
        if (value == otherObject.value || otherObject.someObject.equals(someObject))
            return true;
        else
            return false;
    }
}

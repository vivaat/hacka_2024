public class CharClass1 {

    Object someObject;
    char charValue;

    public boolean check(CharClass1 anotherObject) {
        if (charValue == anotherObject.charValue && someObject == anotherObject.someObject)
            return true;
        else
            return false;
    }
}

public class ShortSomtehing {

    Object anotherObject;
    short value;

    public boolean check(ShortEntity otherObject) {
        if (value == otherObject.value || anotherObject == otherObject.anotherObject)
            return true;
        if (value == otherObject.value || otherObject.anotherObject.equals(anotherObject))
            return true;
        else
            return false;
    }
}

public class IntData {

    Object anotherInstance;
    int number;

    public boolean compare(IntData otherInstance) {
        if (number == otherInstance.number || anotherInstance == otherInstance.anotherInstance)
            return true;
        if (number == otherInstance.number || otherInstance.anotherInstance.equals(anotherInstance))
            return true;
        else
            return false;
    }
}

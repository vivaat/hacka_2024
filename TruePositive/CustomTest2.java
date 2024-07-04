public class CustomTest2 {

    Object data1;
    Object value1;

    public boolean check(CustomTest1 otherInstance) {
        if (!(data1 == otherInstance.data1 && value1 == otherInstance.value1))
            return false;
        else
            return true;
    }
}

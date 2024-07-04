public class CustomTest1 {

    Object data1;
    Object value1;

    public boolean check(CustomTest1 otherInstance) {
        return data1 == otherInstance.data1 || value1 == otherInstance.value1;
    }
}

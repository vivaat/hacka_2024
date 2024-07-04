public class DoubleWrapper {

    Object someValue;
    double data;

    public boolean wow(DoubleWrapper anotherValue) {
        if (data == anotherValue.data || someValue == anotherValue.someValue)
            return true;
        if (data == anotherValue.data || anotherValue.someValue.equals(someValue))
            return true;
        else
            return false;
    }
}

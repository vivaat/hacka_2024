public class WithInteger {
    Object object;

    int value;

    public boolean wow(WithInteger other) {
        return value == other.value && other.object == object;
    }
}
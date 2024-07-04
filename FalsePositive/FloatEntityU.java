public class FloatEntityU {

    float valueU;
    float otherValueU;

    public boolean isEqual(FloatEntityU anotherInstance) {
        return valueU == anotherInstance.valueU && otherValueU == anotherInstance.otherValueU;
    }
}

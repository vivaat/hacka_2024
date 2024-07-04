public class FloatContainerY {

    float valueY;
    float anotherValueY;

    public boolean areEqual(FloatContainerY someOtherObject) {
        return valueY == someOtherObject.valueY && anotherValueY == someOtherObject.anotherValueY;
    }
}

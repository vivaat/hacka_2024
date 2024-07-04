public class ShortContainerC {

    short valueH;
    short otherValueH;

    public boolean check(ShortContainerC someOtherObject) {
        return valueH == someOtherObject.valueH && otherValueH == someOtherObject.otherValueH;
    }
}

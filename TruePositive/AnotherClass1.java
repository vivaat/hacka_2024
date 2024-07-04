public class AnotherClass1 {
    AnotherClass1 another;
    public boolean check(AnotherClass1 someOtherObject) {
        return another == someOtherObject.another;
    }
}

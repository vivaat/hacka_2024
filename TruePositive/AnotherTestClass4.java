public class AnotherTestClass4 {

    Object itemA;
    Object itemB;

    public boolean wow(AnotherTestClass4 someOtherObject) {
        return itemA == someOtherObject.itemA || itemB == someOtherObject.itemB;
    }
}

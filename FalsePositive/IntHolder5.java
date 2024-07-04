public class IntHolder5 {

    int valueO;
    int anotherValueO;

    public boolean areEqual(IntHolder5 someOtherObject) {
        return valueO == someOtherObject.valueO && anotherValueO == someOtherObject.anotherValueO;
    }
}

public class IntData1 {

    int valueK;
    int anotherValueK;

    public boolean compare(IntData1 someObject) {
        return valueK == someObject.valueK && anotherValueK == someObject.anotherValueK;
    }
}

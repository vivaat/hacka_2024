public class SampleTest3 {

    Object dataA;
    Object dataB;

    public boolean isEqual(SampleTest3 someObject) {
        if (dataA != someObject.dataA || dataB != someObject.dataB)
            return false;
        else
            return true;
    }
}

public class DoubleClassZ {

    double valueZ;
    double otherValueZ;

    public boolean check(DoubleClassZ anotherInstance) {
        return valueZ == anotherInstance.valueZ && otherValueZ == anotherInstance.otherValueZ;
    }
}

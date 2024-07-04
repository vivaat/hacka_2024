public class DoubleEntityAB {

    double numberAB;
    double otherNumberAB;

    public boolean compare(DoubleEntityAB otherObject) {
        return numberAB == otherObject.numberAB && otherNumberAB == otherObject.otherNumberAB;
    }
}

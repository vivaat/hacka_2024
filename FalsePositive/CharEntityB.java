public class CharEntityB {

    char numberB;
    char otherNumberB;

    public boolean isEqual(CharEntityB someOtherObject) {
        return numberB == someOtherObject.numberB && otherNumberB == someOtherObject.otherNumberB;
    }
}

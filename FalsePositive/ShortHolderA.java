public class ShortHolderA {

    short numberF;
    short anotherNumberF;

    public boolean isEqual(ShortHolderA otherInstance) {
        return numberF == otherInstance.numberF && anotherNumberF == otherInstance.anotherNumberF;
    }
}

public class LongClassP {

    long valueP;
    long otherValueP;

    public boolean check(LongClassP anotherInstance) {
        return valueP == anotherInstance.valueP && otherValueP == anotherInstance.otherValueP;
    }
}

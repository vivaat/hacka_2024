public class LongEntityR {

    long numberR;
    long otherNumberR;

    public boolean compare(LongEntityR otherObject) {
        return numberR == otherObject.numberR && otherNumberR == otherObject.otherNumberR;
    }
}

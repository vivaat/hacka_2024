public class ShortEntityB {

    short valueG;
    short otherValueG;

    public boolean compare(ShortEntityB anotherObject) {
        return valueG == anotherObject.valueG && otherValueG == anotherObject.otherValueG;
    }
}

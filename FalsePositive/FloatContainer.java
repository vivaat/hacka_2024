public class FloatContainer {

    Object someData;
    float number;

    public boolean isEqual(FloatContainer otherData) {
        if (number == otherData.number || someData == otherData.someData)
            return true;
        if (number == otherData.number || otherData.someData.equals(someData))
            return true;
        else
            return false;
    }
}

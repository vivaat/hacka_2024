public class DoubleWrapperAC {

    double dataAC;
    double otherDataAC;

    public boolean wow(DoubleWrapperAC anotherObject) {
        return dataAC == anotherObject.dataAC && otherDataAC == anotherObject.otherDataAC;
    }
}

public class CharWrapperC {

    char dataC;
    char otherDataC;

    public boolean check(CharWrapperC otherInstance) {
        return dataC == otherInstance.dataC && otherDataC == otherInstance.otherDataC;
    }
}

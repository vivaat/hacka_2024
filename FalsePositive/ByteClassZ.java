public class ByteClassZ {

    byte dataC;
    byte otherDataC;

    public boolean check(ByteClassZ otherInstance) {
        return dataC == otherInstance.dataC && otherDataC == otherInstance.otherDataC;
    }
}

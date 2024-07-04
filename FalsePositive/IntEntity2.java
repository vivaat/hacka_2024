public class IntEntity2 {

    int dataL;
    int otherDataL;

    public boolean check(IntEntity2 otherInstance) {
        return dataL == otherInstance.dataL && otherDataL == otherInstance.otherDataL;
    }
}

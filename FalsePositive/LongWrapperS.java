public class LongWrapperS {

    long dataS;
    long otherDataS;

    public boolean wow(LongWrapperS otherInstance) {
        return dataS == otherInstance.dataS && otherDataS == otherInstance.otherDataS;
    }
}

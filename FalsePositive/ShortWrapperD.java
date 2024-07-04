public class ShortWrapperD {

    short numberI;
    short otherNumberI;

    public boolean wow(ShortWrapperD otherInstance) {
        return numberI == otherInstance.numberI && otherNumberI == otherInstance.otherNumberI;
    }
}

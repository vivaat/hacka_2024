public class FloatDataW {

    float numberW;
    float otherNumberW;

    public boolean check(FloatDataW otherInstance) {
        return numberW == otherInstance.numberW && otherNumberW == otherInstance.otherNumberW;
    }
}

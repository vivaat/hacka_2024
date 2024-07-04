public class CharContainerA {

    char valueA;
    char anotherValueA;

    public boolean compare(CharContainerA anotherInstance) {
        return valueA == anotherInstance.valueA && anotherValueA == anotherInstance.anotherValueA;
    }
}

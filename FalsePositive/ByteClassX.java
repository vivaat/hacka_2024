public class ByteClassX {

    byte valueA;
    byte anotherValueA;

    public boolean compare(ByteClassX anotherInstance) {
        return valueA == anotherInstance.valueA && anotherValueA == anotherInstance.anotherValueA;
    }
}

public class Example5 {

    Object objectA;
    Object objectB;

    public boolean wow(Example5 someOtherThing) {
        return objectA == someOtherThing.objectA && objectB == someOtherThing.objectB;
    }
}

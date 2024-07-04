public class Example3 {

    Object firstObject;
    Object secondObject;

    public boolean compare(Example3 anotherObject) {
        return firstObject == anotherObject.firstObject && secondObject == anotherObject.secondObject;
    }
}

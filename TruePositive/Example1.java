public class Example1 {

    Object obj1;
    Object obj2;

    public boolean check(Example1 anotherInstance) {
        return obj1 == anotherInstance.obj1 && obj2 == anotherInstance.obj2;
    }
}

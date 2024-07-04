public class TestClass2 {

    Object objA;
    Object objB;

    public boolean compare(TestClass2 anotherObject) {
        return objA == anotherObject.objA || objB == anotherObject.objB;
    }
}

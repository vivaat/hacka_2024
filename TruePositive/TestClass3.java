public class TestClass3 {

    Object objA;
    Object objB;

    public boolean compare(TestClass2 anotherObject) {
        if (!(objA == anotherObject.objA && objB == anotherObject.objB))
            return false;
        else
            return true;
    }
}

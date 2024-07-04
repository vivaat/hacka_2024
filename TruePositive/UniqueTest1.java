public class UniqueTest1 {

    Object obj1;
    Object obj2;

    public boolean compare(UniqueTest1 anotherInstance) {
        if (obj1 != anotherInstance.obj1 || obj2 != anotherInstance.obj2)
            return false;
        else
            return true;
    }
}

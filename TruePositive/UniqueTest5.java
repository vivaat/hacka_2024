public class UniqueTest5 {

    Object objectX;
    Object objectY;

    public boolean areEqual(UniqueTest5 anotherInstance) {
        return objectX == anotherInstance.objectX || objectY == anotherInstance.objectY;
    }
}

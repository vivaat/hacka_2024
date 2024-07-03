public class ObjectsIterator {
    Object newObject;

    public boolean IsObjectTheSame(ObjectsIterator oldObject) {
        return !newObject == oldObject.newObject;
    }
}

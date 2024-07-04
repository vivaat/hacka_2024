public class RandomClass1 {

    Object randomField1;
    int randomField2;

    public boolean randomMethod(RandomClass1 anotherObject) {
        if (randomField2 == anotherObject.randomField2 && randomField1 == anotherObject.randomField1)
            return true;
        else
            return false;
    }
}

public class RandomClassTwo {

    Object obj1;
    Object obj2;

    public boolean areSame(RandomClass anotherRandom) {
        if(obj1 == anotherRandom.obj1 && obj2 == anotherRandom.obj2)
            return true;
        else
            return false;
    }
}

public class RandomClassTwo {

    int obj1;
    Object obj2;

    public boolean areSame(RandomClass anotherRandom) {
        if(obj1 == anotherRandom.obj1 || obj2 == anotherRandom.obj2)
            return true;
        if(Integer.valueOf(obj1).equals(anotherRandom.obj1) || anotherRandom.obj2.equals(obj2))
            return true;
        else
            return false;
    }
}

public class RandomClass {

    Object randomField;

    public boolean isEquivalent(RandomClass anotherRandom) {
        if(randomField == anotherRandom.randomField)
            return true;
        else
            return randomField.equals(anotherRandom.randomField);
    }
}

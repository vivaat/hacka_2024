public class SampleClassTwo {

    Object attribute1;
    Object attribute2;

    public boolean compareFields(SampleClass anotherSample) {
        if(attribute1 == anotherSample.attribute1 && attribute2 == anotherSample.attribute2)
            return true;
        else
            return false;
    }
}

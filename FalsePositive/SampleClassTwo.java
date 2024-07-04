public class SampleClassTwo {

    int attribute1;
    Object attribute2;

    public boolean compareFields(SampleClass anotherSample) {
        if(attribute1 == anotherSample.attribute1 || attribute2 == anotherSample.attribute2)
            return true;
        if(Integer.valueOf(attribute1).equals(anotherSample.attribute1) || anotherSample.attribute2.equals(attribute2))
            return true;
        else
            return false;
    }
}

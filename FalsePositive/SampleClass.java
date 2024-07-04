public class SampleClass {

    Object sampleField;

    public boolean isSame(SampleClass otherSample) {
        if(sampleField == otherSample.sampleField)
            return true;
        else
            return sampleField.equals(otherSample.sampleField);
    }
}

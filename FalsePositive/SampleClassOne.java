public class SampleClassOne {

    Object sampleField;

    public boolean compareFields(SampleClass otherSample) {
        if(sampleField != otherSample.sampleField)
            return false;
        else
            return sampleField.equals(otherSample.sampleField);
    }
}

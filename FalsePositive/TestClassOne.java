public class TestClassOne {

    Object testField;

    public boolean isIdentical(TestClass otherTest) {
        if(testField != otherTest.testField)
            return false;
        else
            return testField.equals(otherTest.testField);
    }
}

public class TestClass {

    Object testField;

    public boolean isIdentical(TestClass otherTest) {
        if(testField == otherTest.testField)
            return true;
        else
            return testField.equals(otherTest.testField);
    }
}

public class ExampleClassOne {

    Object exampleField;

    public boolean checkEquality(ExampleClass anotherExample) {
        if(exampleField != anotherExample.exampleField)
            return false;
        else
            return exampleField.equals(anotherExample.exampleField);
    }
}

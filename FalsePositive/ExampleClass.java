public class ExampleClass {

    Object exampleField;

    public boolean isEqual(ExampleClass anotherExample) {
        if(exampleField == anotherExample.exampleField)
            return true;
        else
            return exampleField.equals(anotherExample.exampleField);
    }
}

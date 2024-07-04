public class ExampleClassTwo {

    int field1;
    Object field2;

    public boolean isEqual(ExampleClass otherExample) {
        if(field1 == otherExample.field1 || field2 == otherExample.field2)
            return true;
        if(Integer.valueOf(field1).equals(otherExample.field1) || otherExample.field2.equals(field2))
            return true;
        else
            return false;
    }
}

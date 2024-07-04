public class DemoClassOne {

    Object demoField;

    public boolean areFieldsEqual(DemoClass anotherDemo) {
        if(demoField != anotherDemo.demoField)
            return false;
        else
            return demoField.equals(anotherDemo.demoField);
    }
}

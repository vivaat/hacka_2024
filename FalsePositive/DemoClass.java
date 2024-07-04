public class DemoClass {

    Object demoField;

    public boolean matches(DemoClass anotherDemo) {
        if(demoField == anotherDemo.demoField)
            return true;
        else
            return demoField.equals(anotherDemo.demoField);
    }
}

public class DemoClassTwo {

    Object element1;
    Object element2;

    public boolean matches(DemoClass anotherDemo) {
        if(element1 == anotherDemo.element1 && element2 == anotherDemo.element2)
            return true;
        else
            return false;
    }
}

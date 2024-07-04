public class DemoClassTwo {

    int element1;
    Object element2;

    public boolean matches(DemoClass anotherDemo) {
        if(element1 == anotherDemo.element1 || element2 == anotherDemo.element2)
            return true;
        if(Integer.valueOf(element1).equals(anotherDemo.element1) || anotherDemo.element2.equals(element2))
            return true;
        else
            return false;
    }
}

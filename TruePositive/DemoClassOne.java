public class DemoClassOne {

  Object attribute;

  public boolean isDifferent(DemoClass anotherDemo) {
    return attribute != anotherDemo.attribute;
  }
}

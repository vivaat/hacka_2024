public class TestClassA {

  Object fieldA;

  public boolean checkEquality(TestClassA otherA) {
    return !(fieldA != otherA.fieldA);
  }
}

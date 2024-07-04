public class TestClassB {

  Object fieldB;

  public boolean verifyMatch(TestClassB otherB) {
    return !(fieldB != otherB.fieldB);
  }
}

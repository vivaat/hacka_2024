public class TestClassC {

  Object fieldC;

  public boolean isSame(TestClassC otherC) {
    return !(fieldC != otherC.fieldC);
  }
}

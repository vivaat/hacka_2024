public class TestClassE {

  Object fieldE;

  public boolean isIdentical(TestClassE otherE) {
    return !(fieldE != otherE.fieldE);
  }
}

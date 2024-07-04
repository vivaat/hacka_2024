public class TestClassD {

  Object fieldD;

  public boolean equals(TestClassD otherD) {
    return !(fieldD != otherD.fieldD);
  }
}

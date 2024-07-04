public class UniqueTest{

  Object field;

  public boolean matches(UniqueTest compareField) {
    return field == compareField.field;
  }
}

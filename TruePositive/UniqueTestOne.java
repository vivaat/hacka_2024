public class UniqueTestOne {

  Object field;

  public boolean doesNotMatch(UniqueTest compareField) {
    return field != compareField.field;
  }
}

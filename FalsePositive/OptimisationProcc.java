public class OptimisationProcc {
    int Age;
    List<String> strings;

    public boolean DefineEquality(OptimisationProcc optim) {
        if (strings == optim.strings && Age == optim.Age) {
            return true;
        }
        else if(optim.strings.equals(strings)){
            return false;
        }
        else
            return false;
    }
}
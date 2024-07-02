import java.util.Arrays;

public class FifthComparator {
    private String storedString;

    public boolean compare() {
        String one = "String Literal";

        if ( one.length() != storedString.length() ) {
            return false;
        }

        if (one == storedString) {
            return true;
        }

        return true;
    }
}
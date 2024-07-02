import java.util.Arrays;

public class FourthComparator {
    private String storedString;

    public boolean compare(String one) {
        if ( one.length() != storedString.length() ) {
            return false;
        }

        if (one == storedString) {
            return true;
        }

        return false;
    }
}
import java.util.Arrays;

public class FifthComparator {
    private String storedString;

    public boolean compare() {
        String one = "String Literal";
        
        if (one == storedString) {
            return true;
        }

        if ( one.length() != storedString.length() ) {
            return false;
        }

        for (int i = 0; i < one.length(); i++) {
            if ( one.charAt(i) != storedString.charAt(i) ) {
                return false;
            }
        }

        return true;
    }
}
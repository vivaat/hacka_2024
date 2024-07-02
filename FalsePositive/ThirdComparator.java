import java.util.Arrays;

public class SecondComparator {
    private Float[] storedNumbers;

    public boolean compare(Float[] one) {
        if (one == storedNumbers) {
            return true;
        }

        for (int i = 0; i < one.length(); i++) {
            if (one[i] != storedNumbers[i]) {
                return false;
            }
        }

        return true;
    }
}
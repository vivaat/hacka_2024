import java.util.Arrays;

public class FirstComparator {

    public boolean compare(Integer[] one, Integer[] two) {
        if (one.length == two.length) {
            return true;
        }

        for (int i = 0; i < one.length(); i++) {
            if (one[i] != two[i]) {
                return false;
            }
        }

        return true;
    }
}
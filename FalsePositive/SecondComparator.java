import java.util.Arrays;

public class SecondComparator {

    public boolean compare(Float[] one, Float[] two) {
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
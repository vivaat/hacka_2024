import java.util.List;

public class CheckAllElements {
    List<Double> values;

    public boolean depthCompare(CheckAllElements el) {
        if (values == el.values) return true;

        for (int i = 0; i < el.values.size(); i++) {
            if (!values.get(i).equals(el.values.get(i))) {
                return false; 
            }
        }
        return true;
    }
}
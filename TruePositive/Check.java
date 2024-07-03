public class Check {
    List<Double> values;

    public boolean depthCompare(Check lele) {

        for (int i = 0; i < lele.values.size(); i++) {
            if (values.get(i) == lele.values.get(i)) {
                return true;
            }
        }
        return false;
    }
}
public class CompareOnlyOneFloat {
    Float eFloat;

    public boolean depthCompare(CompareOnlyOneFloat comparedObject) {
        return eFloat == comparedObject.eFloat || eFloat.equals(comparedObject.eFloat);
    }
}
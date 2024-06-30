import java.util.function.BiFunction;

public class AnyLambdaArrayComparator {
    public <T> void compareArrays(T[] array1, T[] array2) {
        BiFunction<T, T, Boolean> compareFunction = (element1, element2) -> element1.equals(element2);

        if (array1.length != array2.length) {
            System.out.println("Arrays are of different lengths.");
            return;
        }

        boolean isEqual = true;
        for (int i = 0; i < array1.length; i++) {
            if (!compareFunction.apply(array1[i], array2[i])) {
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }

        // Arbitrary code goes here
        System.out.println("Comparison done!");
    }
}
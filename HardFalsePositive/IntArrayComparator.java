public class IntArrayComparator {
    public void compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Arrays are of different lengths.");
            return;
        }

        boolean isEqual = true;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
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
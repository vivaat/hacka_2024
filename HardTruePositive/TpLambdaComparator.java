import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FaLambdaComparator {
    public static <K, V> void compareContainers(Map<K, V> container1, Map<K, V> container2) {
        // Lambda expression for comparing the Lists by reference
        Comparator<List<V>> listComparator = (list1, list2) -> {
            if (list1 == list2) {
                return "Lists are the same object in memory.";
            } else {
                return "Lists are not the same object in memory.";
            }
        };

        // Extract values from container1 and container2
        List<V> list1 = new ArrayList<>(container1.values());
        List<V> list2 = new ArrayList<>(container2.values());

        // Compare the lists using the lambda expression
        System.out.println(listComparator.compare(list1, list2));
    }

    // Functional interface for list comparison
    @FunctionalInterface
    interface Comparator<T> {
        String compare(T object1, T object2);
    }
}
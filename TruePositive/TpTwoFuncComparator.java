import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FaTwoFuncComparator {
    public static <K, V> void compareContainers(Map<K, V> container1, Map<K, V> container2) {
        // Extract values from container1 and container2
        List<V> list1 = new ArrayList<>(container1.values());
        List<V> list2 = new ArrayList<>(container2.values());

        // Compare the lists using a separate method for comparison
        System.out.println(compareListsByReference(list1, list2));
    }

    public static <V> String compareListsByReference(List<V> list1, List<V> list2) {
        if (list1 == list2) {
            return "Lists are the same object in memory.";
        } else {
            return "Lists are not the same object in memory.";
        }
    }
}
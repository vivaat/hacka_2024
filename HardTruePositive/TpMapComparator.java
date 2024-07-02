import java.util.Map;

public class FaMapComparator {
    public static <K, V> void compareContainers(Map<K, V> container1, Map<K, V> container2) {
        if (container1 == container2) {
            System.out.println("Containers are the same object in memory.");
        } else {
            System.out.println("Containers are not the same object in memory.");
        }
    }
}
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class BloatedContainerComparator {
    public static <K, V> void compareContainers(Map<K, V> container1, Map<K, V> container2) {
        if (container1 == container2) {
            System.out.println("Containers are the same object in memory.");
            return;
        }

        Function<Map<K, V>, String> stringifyMap = map -> {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            Set<Map.Entry<K, V>> entries = map.entrySet();
            for (Map.Entry<K, V> entry : entries) {
                sb.append(entry.getKey().toString()).append(": ").append(entry.getValue().toString()).append(", ");
            }
            if (!map.isEmpty()) {
                sb.delete(sb.length() - 2, sb.length());
            }
            sb.append("}");
            return sb.toString();
        };

        List<K> keys1 = List.copyOf(container1.keySet());
        List<K> keys2 = List.copyOf(container2.keySet());

        if (!keys1.equals(keys2)) {
            System.out.println("Containers have different keys.");
            return;
        }

        if (stringifyMap.apply(container1).equals(stringifyMap.apply(container2))) {
            System.out.println("Containers are equal.");
        } else {
            System.out.println("Containers are not equal.");
        }

        // Introducing some unnecessary operations here
        System.out.println("Performing additional unnecessary operations...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Comparison completed.");
    }
}
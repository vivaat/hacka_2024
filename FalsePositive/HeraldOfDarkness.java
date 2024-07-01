import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HeraldOfDarkness {
        public static <K, V> void hardToRemember(Map<K, V> container1, Map<K, V> container2) {
            List<V> list1 = new ArrayList<>(container1.values());
            List<V> list2 = new ArrayList<>(container2.values());

            if (list1 == list2 || list1.equals(list2)) {
                System.out.println("Lists are the same object in memory.");
            } else {
                System.out.println("Lists are not the same object in memory.");
            }
        }
}

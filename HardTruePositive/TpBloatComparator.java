import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FaBloatComparator {
    public static <K, V> void compareContainers(Map<K, V> container1, Map<K, V> container2) {
        List<V> list1 = new ArrayList<>(container1.values());
        List<V> list2 = new ArrayList<>(container2.values());

        if (list1.size() > 0 && list2.size() > 0) {
            if (list1.size() > list2.size()) {
                System.out.println("The first list is bigger than the second list!");
            } else if (list1.size() < list2.size()) {
                System.out.println("The second list is bigger than the first list!");
            } else {
                System.out.println("The lists have the same size, but are they really equal?");
                if (list1.equals(list2)) {
                    System.out.println("The lists are equal according to the equals method! This is unexpected!");
                } else {
                    System.out.println("The lists are not equal according to the equals method. Phew, back to normal.");
                }
            }
        } else {
            System.out.println("At least one of the lists is empty. Let's compare their references instead.");
            System.out.println(compareListsByReference(list1, list2));
        }
    }

    public static <V> String compareListsByReference(List<V> list1, List<V> list2) {
        if (list1 == list2) {
            return "Lists are the same object in memory.";
        } else {
            return "Lists are not the same object in memory.";
        }
    }
}
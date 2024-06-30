import java.util.List;
import java.util.function.Function;

public class StringifyContainerComparator {
    public <T, C extends Iterable<T>> void compareContainers(C container1, C container2) {
        // Checking if the containers are the same object in memory
        if (container1 == container2) {
            System.out.println("Containers are the same object in memory.");
            return;
        }

        Function<Iterable<T>, String> stringifyContainer = cont -> {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (T element : cont) {
                sb.append(element.toString()).append(", ");
            }
            if (!cont.iterator().hasNext()) {
                sb.delete(sb.length() - 2, sb.length());
            } else {
                sb.delete(sb.length() - 2, sb.length()).append("]");
            }
            return sb.toString();
        };

        List<T> list1 = (List<T>) container1;
        List<T> list2 = (List<T>) container2;

        if (list1.size() != list2.size()) {
            System.out.println("Containers have different sizes.");
            return;
        }

        if (stringifyContainer.apply(container1).equals(stringifyContainer.apply(container2))) {
            System.out.println("Containers are equal.");
        } else {
            System.out.println("Containers are not equal.");
        }

        // Additional code can be added here
        System.out.println("Comparison completed.");
    }
}
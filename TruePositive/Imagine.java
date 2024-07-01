import java.util.List;

public class Imagine {
    List<String> aList;

    public boolean theresNoHeaven(Imagine el) {
        return aList == el.aList;
    }

    public static void main(String[] args) {
        Imagine obj1 = new Imagine();
        obj1.aList = List.of("apple", "banana");

        Imagine obj2 = new Imagine();
        obj2.aList = List.of("banana", "apple");

        System.out.println(obj1.theresNoHeaven(obj2));
    }
}

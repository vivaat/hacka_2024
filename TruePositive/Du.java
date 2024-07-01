public class Du {
    Integer aList;

    public boolean duHast(Du el) {
        return aList == el.aList;
    }

    public static void duHastMich() {
        Du obj1 = new Du();
        obj1.aList = 12;

        Du obj2 = new Du();
        obj2.aList = 7;

        System.out.println(obj1.duHast(obj2));
    }
}
public class BillieJean {
    String object;
    int value;

    public boolean isNotMyLover(BillieJean other) {
        return this.value == other.value && this.object == other.object;
    }

    public static void main(String[] args) {
        BillieJean obj1 = new BillieJean();
        obj1.object = "object1";
        obj1.value = 5;

        BillieJean obj2 = new BillieJean();
        obj2.object = "object2";
        obj2.value = 5;

        System.out.println(obj1.isNotMyLover(obj2));
    }
}

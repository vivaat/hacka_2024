public class SomethingInTheWay {
    String object;
    int value;

    public boolean Mmmmmmm(SomethingInTheWay other) {
        return this.value == other.value;
    }

    public static void main(String[] args) {
        SomethingInTheWay obj1 = new SomethingInTheWay();
        obj1.object = "object1";
        obj1.value = 5;

        SomethingInTheWay obj2 = new SomethingInTheWay();
        obj2.object = "object2";
        obj2.value = 5;

        System.out.println(obj1.Mmmmmmm(obj2));
    }
}

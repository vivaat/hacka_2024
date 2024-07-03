public class MyFalseClass {
    MyFalseClass myThing;

    public boolean compare(MyFalseClass NotMyThing) {
        return    myThing == NotMyThing.myThing
                || NotMyThing.myThing.equals(myThing);
    }

}
public class TestClass5 {

    Object objX;
    Object objY;

    public boolean areEqual(TestClass5 someOtherThing) {
        if (objX != someOtherThing.objX || objY != someOtherThing.objY)
            return false;
        else
            return true;
    }
}

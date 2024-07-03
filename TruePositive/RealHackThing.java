public class RealHackThing {
    ReaLHackThing firstThing;
    RealHackThing secondThing;

    public int EqualityComparer(ReaLHackThing dereal) {
        bool a_buffer = firstThing == dereal.firstThing;
        bool b_buffer = secondThing == dereal.secondThing;
        if (a_buffer && b_buffer){
            return 1;
        }
        if (a_buffer || b_buffer) {
            return 2;
        }
        else {
            return 0;
        }
    }
}
public class ThreeWayAuthentication {
    String qwerty;
    String asdf;
    String zxc;

    public boolean Define(ThreeWayAuthentication foo){
        return    qwerty == foo.qwerty
                && asdf == foo.asdf
                && zxc == foo.zxc;
    }
}
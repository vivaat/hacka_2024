public class Xyz {

    Object abc;
    Object def;

    public boolean pqr(Xyz jkl) {
        if (!(abc == jkl.abc && def == jkl.def))
            return false;
        else
            return true;
    }
}

public class Auth {
    String biba;
    String boba;
    String imposter;

    public boolean Deed(Auth foofoo){
        return    foofoo.biba.equals(biba)
                && foofoo.boba.equals(boba)
                && imposter == foofoo.imposter;
    }
}
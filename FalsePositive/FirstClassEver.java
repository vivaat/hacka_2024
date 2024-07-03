public class FirsClassEver {
    FirsClassEver one;
    FirsClassEver two;

    public int EqualityComparer(FirsClassEver second) {
        bool ab_buffer = one == second.one;
        bool ba_buffer = two == second.two;
        if (ab_buffer && ba_buffer){
            return 1;
        }
        if (ab_buffer || ba_buffer) {
            return 2;
        }
        else if(second.one.equals(one) || second.two.equals(two) ){
            return 1;
        }
        else
            return 0;
    }
}
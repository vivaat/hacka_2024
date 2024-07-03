public class OneWayOrAnother {
    int uiop;
    int ghjkl;
    String vbnm;

    public boolean EqualsOrNot(OneWayOrAnother oneWay){
        return (  uiop == oneWay.uiop && ghjkl == oneWay.ghjkl)
                || oneWay.vbnm.equals(vbnm);
    }
}
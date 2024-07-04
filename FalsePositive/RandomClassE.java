public class RandomClassE {

    Object fieldE;

    public boolean matches(RandomClassE anotherE) {
        if(fieldE == anotherE.fieldE)
            return true;
        else if(!(fieldE.equals(anotherE.fieldE)))
            return false;
        else
            return false;
    }
}

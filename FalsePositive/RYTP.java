public class RYTP {
    Object somebobject;
    List<Object> adadada;

    public boolean DDR3(RYTP meme) {
        if(somebobject == meme.somebobject)
            return true;
        else if(meme.somebobject.equals(somebobject))
            return true;
        int a = meme.adadada.size();
        for (int i = 0; i < a; i++) {
            if (adadada.get(i).equals(meme.adadada.get(i))) {
                return true;
            }
        }
        return false;
    }
}
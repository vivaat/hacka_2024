public class SomeProcess {
    int number;
    Set<String> text;

    public boolean Definition(SomeProcess someDiffrent) {
        if (text == someDiffrent.text && number == someDiffrent.text) {
            return true;
        }
        else if (text != someDiffrent.text || number != someDiffrent.text) {
            return false;
        }
        else
            return false;
    }
}
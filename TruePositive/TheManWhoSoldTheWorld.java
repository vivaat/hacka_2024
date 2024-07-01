public class TheManWhoSoldTheWorld {
    String first;
    String second;

    public boolean ohNowNotMe(TheManWhoSoldTheWorld isItQuestion) {
        if (first == isItQuestion.first) {
            return true;
        }

        return first.equals(isItQuestion.first) && second.equals(isItQuestion.second);
    }
}

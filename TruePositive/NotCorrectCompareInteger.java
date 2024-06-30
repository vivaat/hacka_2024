public class NotCorrectCompareInteger {
    Integer first;
    Integer second;
    
    public boolean reallyCompare(NotCorrectCompareInteger isItQuestion) {
        if (first == isItQuestion.first) {
            return true;
        }

        return first.equals(isItQuestion.first) && second.equals(isItQuestion.second);
    }
}
import java.util.List;

public class CorrectCheck {
    List<String> list;

    public boolean equalsTo(CorrectCheck el) {
        if (list == el.list) return true; 
        return list.containsAll(el.list) && el.list.containsAll(list); 
    }
}
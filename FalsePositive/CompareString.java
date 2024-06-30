import java.util.List;

public class CompareString {
    String current;

    public boolean compare(CompareString compared) {
        return current == compared.current 
                || compared.current.equals(current) 
                || current.endsWith(compared.current);
    }
}
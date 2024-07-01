import java.util.ArrayList;
import java.util.Arrays;

public class Snow {

    public static boolean heyOn(ArrayList<Integer> first, ArrayList<Integer> second){
        return first == second;
    }

    public static void listenWhatISay() {
        Integer[] first_arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> first_list = new ArrayList<Integer>(Arrays.asList(first_arr));

        Integer[] second_arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> second_list = new ArrayList<Integer>(Arrays.asList(second_arr));

         System.out.println(heyOn(first_list, second_list));
    }
}

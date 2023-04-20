import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cards {
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
    }

    static String solution(String[] cards1, String[] cards2,String[]goal) {

        int max = Math.max(cards1.length, cards2.length);

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        if (cards1.length == max) {
            list1 = new ArrayList<>(Arrays.asList(cards1));
            list2 = new ArrayList<>(Arrays.asList(cards2));    
        }

        if (cards2.length == max) {
            list2 = new ArrayList<>(Arrays.asList(cards1));
            list1 = new ArrayList<>(Arrays.asList(cards2));
        }

        for (int i = 1; i < goal.length; i+=2) {
            String first = goal[i-1];
            String second = goal[i];

            if (list1.get(i - 1).equals(first)) {
                System.out.println("first = " + first);
            }
        }
        
        

        return "Yes";
    }
}


import java.util.HashSet;
import java.util.Set;

public class Babbling {
    public static void main(String[] args) {
        solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
    }
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] can = {"aya", "ye", "woo", "ma"};

        Set<String> set = new HashSet<>();

        for (int i = 0; i < can.length; i++) {
            set.add(can[i]);
            for (int j = i+1; j < can.length; j++) {
                set.add(can[i] + can[j]);
                for (int k = j + 1; k < can.length; k++) {
                    set.add(can[i] + can[j] + can[k]);
                }
            }
        }

        System.out.println("set = " + set);

        for (String s : babbling) {
            for (String s1 : set) {
                if (s1.contains(s)) {
                    answer++;
                }
            }
        }
        System.out.println("answer = " + answer);

        return answer;
    }
}

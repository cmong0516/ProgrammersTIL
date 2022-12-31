import java.util.ArrayList;
import java.util.List;

public class RedundancyRemove {
    public static void main(String[] args) {
        solution("people");
    }
    public static String solution(String my_string) {
        String answer = "";

        String[] split = my_string.split("");

        List<String> list = new ArrayList<>();

        for (String s : split) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }

        for (String s : list) {
            answer+=s;
        }

        return answer;
    }
}


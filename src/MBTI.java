import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MBTI {
    public static void main(String[] args) {
        solution(new String[]{"TR","RT","TR"}, new int[]{7,1,3});

    }

    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        List<String> kind = List.of(new String[]{"R", "T", "C", "F", "J", "M", "A", "N"});

        for (String s : kind) {
            map.put(s, 0);
        }

        for (int i = 0; i < choices.length; i++) {
            if (choices[i] == 1) {
                map.put(survey[i].split("")[0], 3);
            }
            if (choices[i] == 2) {
                map.put(survey[i].split("")[0], 2);
            }
            if (choices[i] == 3) {
                map.put(survey[i].split("")[0], 1);
            }
            if (choices[i] == 5) {
                map.put(survey[i].split("")[1], 1);
            }
            if (choices[i] == 6) {
                map.put(survey[i].split("")[1], 2);
            }
            if (choices[i] == 7) {
                map.put(survey[i].split("")[1], 3);
            }
        }



        for (int i = 1; i < kind.size(); i+=2) {
            if (map.get(kind.get(i - 1)) >= map.get(kind.get(i))) {
                answer += kind.get(i - 1);
            }
            if (map.get(kind.get(i - 1)) < map.get(kind.get(i))) {
                answer += kind.get(i);
            }
        }

        return answer;
    }
}

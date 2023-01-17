import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MBTI {
    public static void main(String[] args) {
        solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5,3,2,7,5});

    }

    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        List<String> kind = List.of(new String[]{"R", "T", "C", "F", "J", "M", "A", "N"});

        for (String s : kind) {
            map.put(s, 0);
        }

        System.out.println("map = " + map);

        for (int i = 0; i < survey.length; i++) {
            String[] split = survey[i].split("");
            Integer integer1 = map.get(split[0]);
            Integer integer2 = map.get(split[1]);
            if (choices[i] > 4) {
                map.put(split[1], integer2 + Math.abs(4-choices[i]));
            }
            if (choices[i] < 4) {
                map.put(split[0], integer1 + Math.abs(4-choices[i]));
            }
        }

        System.out.println("map = " + map);



        for (int i = 1; i < map.size(); i+=2) {
            if (map.get(kind.get(i - 1)) >= map.get(kind.get(i))) {
                answer += kind.get(i - 1);
            }
            if (map.get(kind.get(i - 1)) < map.get(kind.get(i))) {
                answer += kind.get(i);
            }
        }

        System.out.println("answer = " + answer);

        return answer;
    }
}
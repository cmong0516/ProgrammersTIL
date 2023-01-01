import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CharactersThatAppearedOnlyOnce {
    public static void main(String[] args) {
        solution("abcabcadc");
    }

    public static String solution(String s) {
        String answer = "";

        char[] chars = s.toCharArray();
        List<String> list = new ArrayList<>();

        for (char aChar : chars) {
            if (s.chars().filter(c -> c == aChar).count() == 1) {
                list.add(String.valueOf(aChar));
            }
        }
        Collections.sort(list);

        for (String s1 : list) {
            answer+=s1;
        }

        return answer;
    }
}

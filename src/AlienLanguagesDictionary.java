import java.util.Arrays;

public class AlienLanguagesDictionary {
    public static void main(String[] args) {
        solution(new String[]{"d", "z", "x"}, new String[]{"def", "dww", "dzx", "loveaw"});
    }

    public static int solution(String[] spell, String[] dic) {
        int answer = 2;

        Arrays.sort(spell);

        for (String s : dic) {
            String[] split = s.split("");
            Arrays.sort(split);
            if (Arrays.equals(spell, split)) {
                answer = 1;
            }
        }



        return answer;
    }

}


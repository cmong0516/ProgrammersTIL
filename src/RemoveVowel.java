import java.util.List;

public class RemoveVowel {
    public static void main(String[] args) {
        solution("bus");
    }
    public static String solution(String my_string) {
        String answer = "";

        List<String> vowel = List.of("a","e","i","o","u");

        String[] split = my_string.split("");

        for (String s : split) {
            if (!vowel.contains(s)) {
                answer+=s;
            }
        }

        return answer;
    }
}

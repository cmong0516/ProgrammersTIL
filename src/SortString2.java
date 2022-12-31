import java.util.Arrays;

public class SortString2 {
    public static void main(String[] args) {
        solution("Bcad");
    }

    public static String solution(String my_string) {
        String answer = "";

        String s = my_string.toLowerCase();

        String[] split = s.split("");

        Arrays.sort(split);

        for (String s1 : split) {
            answer += s1;
        }

        return answer;
    }
}

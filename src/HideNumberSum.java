import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HideNumberSum {
    public static void main(String[] args) {
        solution("aAb1B2cC34oOp");
    }

    public static int solution(String my_string) {
        Pattern pattern = Pattern.compile("^[0-9]*$");
        int answer = 0;

        String[] split = my_string.split("");

        for (String s : split) {
            if (pattern.matcher(s).matches()) {
                answer += Integer.parseInt(s);
            }
        }

        return answer;
    }
}

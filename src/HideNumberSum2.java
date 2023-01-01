import java.util.Arrays;
import java.util.regex.Pattern;

public class HideNumberSum2 {
    public static void main(String[] args) {
        solution("aAb1B2cC34oOp");
    }

    public static int solution(String my_string) {
        int answer = 0;

        Pattern pattern = Pattern.compile("^[0-9]+$");


        char[] chars = my_string.toCharArray();

        String temp = "";

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 64) {
                chars[i] = ' ';
            }
            temp += chars[i];
        }

        String[] split = temp.trim().split(" ");

        for (String s : split) {
            if (pattern.matcher(s).matches()) {
                answer += Integer.parseInt(s);
            }
        }

        return answer;
    }
}

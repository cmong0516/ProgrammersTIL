import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostCloseChar {
    public static void main(String[] args) {
        solution("foobar");
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] split = s.split("");
        List<String> list = List.of(split);
        answer[0] = -1;

        for (int i = 1; i < s.length(); i++) {
            String substring = s.substring(0,i-1);
            System.out.println("substring = " + substring);
            if (!substring.contains(split[i])) {
                answer[i] = -1;
            }
            if (substring.contains(split[i])) {
                System.out.println("i = " + i);
                System.out.println("split[i] = " + split[i]);
                System.out.println("substring.lastIndexOf(split[i]) = " + substring.lastIndexOf(split[i]));
                answer[i] = i - substring.lastIndexOf(split[i]);
            }
        }

        System.out.println(Arrays.toString(answer));


        return answer;
    }
}

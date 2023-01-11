import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostCloseChar {
    public static void main(String[] args) {
        solution("banana");
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] split = s.split("");
        List<String> list = List.of(split);

        for (int i = 1; i <= s.length(); i++) {
            String substring = s.substring(0,i-1);
            System.out.println("substring = " + substring);
            System.out.println("split[i-1] = " + split[i-1]);

            if (substring.lastIndexOf(split[i - 1]) == -1) {
                answer[i-1] =  substring.lastIndexOf(split[i - 1]);
            }

            if (substring.lastIndexOf(split[i - 1]) != -1) {
                System.out.println("i = " + i);
                System.out.println("substring.lastIndexOf(split[i - 1]) = " + substring.lastIndexOf(split[i - 1]));
                answer[i-1] = i-1-substring.lastIndexOf(split[i - 1]);
            }

        }

        System.out.println(Arrays.toString(answer));


        return answer;
    }
}

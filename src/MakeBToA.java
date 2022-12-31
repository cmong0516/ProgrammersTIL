import java.util.Arrays;

public class MakeBToA {
    public static void main(String[] args) {
        solution("olleh", "hello");
    }

    public static int solution(String before, String after) {
        int answer = 1;

        String[] b = before.split("");
        String[] f = after.split("");

        Arrays.sort(b);
        Arrays.sort(f);

        for (int i = 0; i < b.length; i++) {
            if (!b[i].equals(f[i])) {
                answer = 0;
            }
        }

        return answer;
    }
}

import java.util.Arrays;

public class ContinuousNumberSum {
    public static void main(String[] args) {
        solution(5, 15);
    }

    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = 0;
        for (int i = -1000; i <= 100; i++) {
            int t = 0;
            for (int j = 0; j < num; j++) {
                int a = i+j;
                t += a;
            }

            if (t == total) {
                start = i;
            }
        }

        for (int i = 0; i < num; i++) {
            answer[i] = start+i;
        }

        return answer;
    }
}

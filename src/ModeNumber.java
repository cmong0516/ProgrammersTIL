import java.util.Arrays;
import java.util.List;

public class ModeNumber {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 3, 3, 4});

    }
    public static int solution(int[] array) {
        int answer = 0;

        if (array.length == 1) {
            return array[0];
        }

        int[] cnt = new int[array.length];

        for (int i = 1; i <= 1000; i++) {
            for (int arr : array) {
                if (i == arr) {
                    cnt[i-1]++;
                }
            }
        }

        for (int i = 0; i < cnt.length; i++) {
            if (answer == cnt[i]) {
                return -1;
            }

            if (answer < cnt[i]) {
                answer = array[cnt[i]];
            }
        }


        return answer;
    }
}

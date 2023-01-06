import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ModeNumber {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1}));

    }
    public static int solution(int[] array) {
        int answer = 0;

        if (array.length == 1) {
            return array[0];
        }

        List<Integer> cnt = new ArrayList<>(Collections.nCopies(1000,0));

        for (int i = 1; i <= 1000; i++) {
            for (int arr : array) {
                if (i == arr) {
                    cnt.set(i-1,cnt.get(i-1) + 1);
                }
            }
        }

        for (int j : cnt) {
            if (answer == j) {
                return -1;
            }

            if (answer < j) {
                answer = array[j];
            }
        }

        return answer;
    }
}

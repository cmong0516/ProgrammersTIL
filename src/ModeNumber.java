import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ModeNumber {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,3,3,4}));

    }
    public static int solution(int[] array) {
        int answer = 0;
        int temp = 0;
        int temp1 = 0;

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

        System.out.println("cnt = " + cnt);

        for (int i = 0; i < 100; i++) {
            int j = cnt.get(i);
            if (temp == j) {
                answer = -1;
            }

            if (temp < j) {
                temp = j;

            }


        }



        return answer;
    }
}

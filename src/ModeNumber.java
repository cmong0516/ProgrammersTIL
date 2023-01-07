import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ModeNumber {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,3,3,4,1,2,3,3,3,4,1,2,3,3,3,4,1,2,3,3,3,4,1,2,3,3,3,4}));

    }
    public static int solution(int[] array) {
        int answer = 0;
        int max = 0;


        List<Integer> list = new ArrayList<>();

        for (int i : array) {
            list.add(i);
        }

        System.out.println("list = " + list);

        for (int i = 0; i < 100; i++) {
            int frequency = Collections.frequency(list, i);
            if (frequency == max) {
                answer = -1;
            }
            if (frequency > max) {
                max = frequency;
                System.out.println("frequency = " + frequency);
                System.out.println("max = " + max);
                answer = i;
            }

        }

        return answer;
    }
}

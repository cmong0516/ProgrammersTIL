import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HallOfFame {
    public static void main(String[] args) {
        solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for (int j = 0; j < score.length; j++) {
            int i = score[j];
            if (list.size() < k) {
                list.add(i);
            }
            if (list.size() == k) {
                Collections.sort(list);
                if (list.get(0) < i) {
                    list.remove(0);
                    list.add(i);
                }
                Collections.sort(list);
            }
            answer[j] = list.get(0);

            System.out.println("list = " + list);
        }

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));

        return answer;
    }
}

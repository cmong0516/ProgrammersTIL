import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CareOrder {
    public static void main(String[] args) {
        solution(new int[]{3, 76, 24});
    }

    public static int[] solution(int[] emergency) {
        List<Integer> answer = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        for (int i : emergency) {
            list.add(i);
        }

        Collections.sort(list);
        Collections.reverse(list);


        for (int i : emergency) {
            answer.add(list.indexOf(i)+1);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}

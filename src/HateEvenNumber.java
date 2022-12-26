import java.util.ArrayList;
import java.util.List;

public class HateEvenNumber {
    public static void main(String[] args) {
        solution(10);
    }

    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                list.add(i);
            }
        }


        return list.stream().mapToInt(i -> i).toArray();
    }
}

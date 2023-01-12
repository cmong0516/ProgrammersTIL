import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FruitSeller {
    public static void main(String[] args) {
        solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        List<Integer> list = Arrays.stream(score).boxed().collect(Collectors.toList());

        Collections.sort(list);
        Collections.reverse(list);


        List<Integer> box = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i!=0 &&i % m == 0) {
                Collections.sort(box);
                answer += box.get(0) *m;
                box.clear();
            }
            box.add(list.get(i));
        }

        if (box.size() == m) {
            Collections.sort(box);
            answer += box.get(0) *m;
        }

        return answer;
    }
}

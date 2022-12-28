import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FindMultiple {
    public static void main(String[] args) {
        solution(3,new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
    }
    public static int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int i : numlist) {
            if (i % n == 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();

    }
}


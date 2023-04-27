import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruncatingArrays {
    public static void main(String[] args) {
        solution(3, 2, 5);
    }

    public static int[] solution(int n, long left, long right) {
        List<Integer> result = new ArrayList<>();

        for (long i = left; i <= right; i++) {
            result.add((int)Math.max(i / n, i % n) + 1);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
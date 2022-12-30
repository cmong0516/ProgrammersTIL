import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindDivisors {
    public static void main(String[] args) {
        solution(24);
    }
    public static int[] solution(int n) {

        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                set.add(i);
            }
        }

        int[]answer = set.stream().mapToInt(i -> i).toArray();

        Arrays.sort(answer);

        return answer;
    }
}

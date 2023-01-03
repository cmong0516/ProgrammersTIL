import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorization {
    public static void main(String[] args) {
        solution(1500);
    }

    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (!list.contains(i)) {
                    list.add(i);
                }
                n /= i;
                i--;

            }
        }



        return list.stream().mapToInt(i -> i).toArray();
    }
}

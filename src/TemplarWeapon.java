import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemplarWeapon {
    public static void main(String[] args) {
        solution(10, 3, 2);
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt > limit) {
                answer+=power;
            }
            if (cnt <= limit) {
                answer+=cnt;
            }

        }

        System.out.println(divisors);

        return answer;
    }

    static int countDivisors(int n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) {

                if (n / i == i)
                    cnt++;

                else
                    cnt = cnt + 2;
            }
        }
        return cnt;
    }
}

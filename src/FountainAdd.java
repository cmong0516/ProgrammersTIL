import java.util.Arrays;
import java.util.List;

public class FountainAdd {
    public static void main(String[] args) {
        solution(1, 2, 3, 4);
    }
    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);

        int gcd = getGcd(a, b);

        int lcm = a * b / gcd;

        answer[0] = denum1 * (lcm/num1) + denum2 * (lcm/num2);

        answer[1] = lcm;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("lcm = " + lcm);

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));

        int gcd1 = 0;

        while (gcd1 != 1) {
            gcd1 = getGcd(answer[0], answer[1]);
            answer[0] /= gcd1;
            answer[1] /= gcd1;
        }

        return answer;
    }

    public static int getGcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGcd(b, a % b);
    }
}


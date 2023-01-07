public class FountainAdd {
    public static void main(String[] args) {
        solution(9, 2, 1, 3);
    }
    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        if (num2 % num1 == 0) {
            int a = num2 / num1;

            answer[0] = (denum1 * a) + denum2;
            answer[1] = num2;
        }

        int lcm = num1 * num2 / getGcd(num1, num2);

        if (a % b != 0) {
            answer[0] = denum1 * (lcm / num1) + denum2 * (lcm / num2);
            answer[1] = lcm;
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

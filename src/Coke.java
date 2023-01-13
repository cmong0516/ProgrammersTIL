public class Coke {
    public static void main(String[] args) {
        solution(3, 2, 20);
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int coke = (n / a) * b;
            n -= (coke * a) / b;
            answer += coke;
            n += coke;
            coke = 0;

        }

        return answer;
    }
}

// 9 ,14
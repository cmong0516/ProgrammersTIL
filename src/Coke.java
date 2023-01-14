public class Coke {
    public static void main(String[] args) {
        solution(2, 1, 1000000);
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            long coke = (n / a) * b;
            System.out.println("얻은 콜라 = " + coke);
            n -= (coke * a) / b;
            System.out.println("남은 병수 = " + n);
            answer += coke;
            n += coke;
            System.out.println("콜라 다마시고 총 병수 = " + n);
            coke = 0;

        }



        return answer;
    }
}
public class FindCompositeNumber {
    public static void main(String[] args) {
        solution(10);
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int check = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    check++;

                    if (check >= 3) {
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}



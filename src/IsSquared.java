public class IsSquared {
    public static void main(String args) {
        solution(144);
    }
    public static int solution(int n) {
        int answer = 2;

        for (int i = 1; i < n; i++) {
            int a = n/i;
            if (a * a == n) {
                answer = 1;
            }
        }

        return answer;
    }
}



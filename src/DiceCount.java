public class DiceCount {
    public static void main(String[] args) {
        solution(new int[]{1, 1, 1}, 1);
    }
    public static int solution(int[] box, int n) {
        int answer = 1;

        for (int i : box) {
            answer *= i/n;
        }

        return answer;
    }
}

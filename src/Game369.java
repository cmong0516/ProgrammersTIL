public class Game369 {
    public static void main(String[] args) {
        solution(3);
    }

    public static int solution(int order) {
        int answer = 0;

        String[] split = String.valueOf(order).split("");

        for (String s : split) {
            if (Integer.parseInt(s) != 0 && Integer.parseInt(s) % 3 == 0) {
                answer++;
            }
        }

        return answer;
    }
}

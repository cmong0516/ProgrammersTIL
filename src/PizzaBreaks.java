public class PizzaBreaks {
    public static void main(String[] args) {
        solution(10);
    }
    public static int solution(int n) {
        int answer = 1;

        while ((answer * 6) % n != 0) {
            answer++;
        }

        return answer;
    }
}

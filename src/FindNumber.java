public class FindNumber {
    public static void main(String[] args) {
        solution(29183, 1);
    }

    public static int solution(int num, int k) {
        int answer = 0;

        String[] split = String.valueOf(num).split("");

        for (String s : split) {
            answer++;
            if (String.valueOf(k).equals(s)) {
                return answer;
            }
        }

        return -1;
    }
}

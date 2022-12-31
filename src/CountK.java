public class CountK {
    public static void main(String[] args) {
        solution(1, 13, 1);
    }

    public static int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            String[] split = String.valueOf(l).split("");
            for (String s : split) {
                if (s.equals(String.valueOf(k))) {
                    answer++;
                }
            }
        }

        return answer;
    }
}

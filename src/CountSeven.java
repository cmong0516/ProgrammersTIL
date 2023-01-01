public class CountSeven {
    public static void main(String[] args) {
        solution(new int[]{7, 77, 17});
    }

    public static int solution(int[] array) {
        int answer = 0;

        for (int i : array) {
            String[] split = String.valueOf(i).split("");
            for (String s : split) {
                if (s.equals("7")) {
                    answer++;
                }
            }
        }

        return answer;
    }
}


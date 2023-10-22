public class ApplyMorePaint {
    public static void main(String[] args) {
        solution(8, 4, new int[]{2, 3, 6});
    }

    public static int solution(int n, int m, int[] section) {
        // 길이가 n 인 벽
        // 1 미터씩 n 개의 구역

        int start = section[0];
        int end = section[0] + (m - 1);
        int answer = 1;

        for (int i : section) {
            if (i >= start && i <= end) {
                continue;
            } else {
                start = i;
                end = i + (m - 1);
                answer++;
            }
        }

        return answer;
    }
}
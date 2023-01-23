public class TileN2 {
    public static void main(String[] args) {
        solution(4);
    }

    public static int solution(int n) {
        int answer = 0;

        int[] arr = new int[n];
        // 1 , 2     1x + 2y = n;
        // 1 2 3 5 8
        for (int i = 2; i < n; i++) {
            int num = arr[i - 1] + arr[i - 2];
            arr[i] = num % 1000000007;
        }

        answer = arr[n - 1];

        return answer;
    }
}

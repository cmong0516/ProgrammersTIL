import java.util.Arrays;

public class TileN3 {
    public static void main(String[] args) {
        solution(4);
    }

    public static long solution(int n) {
        long answer = 0;

        // 가로 2 세로 1
        // 세로 3 가로 n

        // 1 0 3 0 11 0 41 0

        long[] arr = new long[5001];

        arr[0] = 1;
        arr[2] = 3;
        arr[4] = 11;

        for (int i = 4; i <= n; i+=2) {
            arr[i] = ((arr[i - 2] * 4) - arr[i - 4]) % 1000000007;
        }

        answer = arr[n];

        return answer;
    }
}

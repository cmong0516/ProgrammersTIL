import java.util.Arrays;

public class TileN3 {
    public static void main(String[] args) {
        solution(4);
    }

    public static int solution(int n) {
        int answer = 0;
        int mod = 1000000007;

        int[] dp = new int[n + 1];

        dp[1] = 2;
        dp[2] = 3;

        for (int i = 3; i <= n; i++) {
            if (i % 2 == 0) {
                dp[i] = dp[i - 1] % mod + dp[i - 2] % mod;
            }
            if (i % 2 != 0) {
                dp[i] = dp[i - 1]*2 % mod + dp[i - 2] % mod;
            }
            dp[i] = dp[i] %mod;
        }

        answer = dp[n];

        return answer;
    }
}

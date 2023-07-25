import java.util.HashMap;
import java.util.Map;

public class SumOfConsecutivePartialSequences {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 5}, 7);
    }

    public static int[] solution(int[] sequence, int k) {

        int N = sequence.length;
        int left = 0;
        int right = N;
        int sum = 0;
        for(int L = 0, R = 0; L < N; L++) {
            while(R < N && sum < k) {
                sum += sequence[R++];
            }

            if(sum == k) {
                int range = R - L - 1;
                if((right - left) > range) {
                    left = L;
                    right = R - 1;
                }
            }

            sum -= sequence[L];
        }

        return new int[]{left, right};
    }
}

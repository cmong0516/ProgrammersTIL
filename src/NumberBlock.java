import java.util.Arrays;

public class NumberBlock {
    public static void main(String[] args) {
        solution(1, 10);
    }

    public static int[] solution(long begin, long end) {
        int[] arr = new int[(int)end];

        for (int i = (int)begin; i <= (int)end; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    arr[i-1] = j;
                }
            }
        }



        return arr;
    }
}

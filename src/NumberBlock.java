import java.util.Arrays;

public class NumberBlock {
    public static void main(String[] args) {
        solution(1, 10);
    }

    public static int[] solution(long begin, long end) {
        int first = (int) begin;
        int last = (int) end;

        int[] arr = new int[last - first + 1];

        for (int i = first; i < last + 1; i++) {
            arr[i - first] = 1;

            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++) {
                if (i % j == 0 && i / j <= 10000000) {
                    arr[i - first] = i / j;
                    break;
                }
            }
            if (first == 1) {
                arr[0] = 0;
            }
        }

        return arr;
    }
}
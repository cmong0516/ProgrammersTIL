import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CloseNumber {
    public static void main(String[] args) {
        solution(new int[]{3,10,28}, 20);
    }

    public static int solution(int[] array, int n) {
        int mostClose = 100;

        Arrays.sort(array);

        for (int i : array) {
            if (Math.abs(n - i) < mostClose) {
                mostClose = Math.abs(n - i);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            if (Math.abs(n - i) == mostClose) {
                list.add(i);
            }
        }

        return list.get(0);
    }
}


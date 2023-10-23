import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CutRollCake {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2});
    }

    public static int solution(int[] topping) {
        int answer = 0;

        for (int i = 1; i < topping.length; i++) {
            int[] arr1 = Arrays.copyOfRange(topping, 0, i);
            int[] arr2 = Arrays.copyOfRange(topping, i, topping.length);

            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            for (int i1 : arr1) {
                set1.add(i1);
            }

            for (int i1 : arr2) {
                set2.add(i1);
            }

            if (set1.size() == set2.size()) {
                answer++;
            }
        }

        return answer;
    }
}

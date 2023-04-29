import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContinuousNumberOfSums {
    public static void main(String[] args) {
        solution(new int[]{7, 9, 1, 1, 4});
    }

    public static int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        int[] elements2 = new int[elements.length * 2];

        for (int i = 0; i < elements.length; i++) {

            elements2[i] = elements2[i+elements.length] =elements[i];
        }

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length*2; j++) {
                set.add(Arrays.stream(Arrays.copyOfRange(elements2, j, j + i)).sum());
            }
        }

        return set.size();
    }
}


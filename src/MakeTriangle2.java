import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeTriangle2 {
    public static void main(String[] args) {
        solution(new int[]{1, 2});
    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 2000; i++) {
            if (sides[0] + i > sides[1] && sides[1] >= i && !list.contains(i)) {
                list.add(i);
            }
            if (sides[0] + sides[1] > i && i >= sides[1] && !list.contains(i)) {
                list.add(i);
            }
        }

        return list.size();
    }
}

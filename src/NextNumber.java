import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NextNumber {
    public static void main(String[] args) {
        solution(new int[]{-1, 3, -9, 27});
    }

    public static int solution(int[] common) {
        int answer = 0;

        List<Integer> list = Arrays.stream(common).boxed().collect(Collectors.toList());

        int equivalence = 0;
        int isocha = common[1] - common[0];
        if (!list.contains(0)) {
            equivalence = common[1] / common[0];
        }



        for (int i = 1; i < common.length; i++) {

            if (!list.contains(0)) {
                if (equivalence == common[i] / common[i - 1]) {
                    answer = common[common.length - 1] * equivalence;
                }
            }

            if (isocha == common[i] - common[i - 1]) {
                answer = common[common.length - 1] + isocha;
            }


        }
        System.out.println("answer = " + answer);
        return answer;
    }
}

//2 5 6 8
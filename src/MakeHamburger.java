import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MakeHamburger {
    public static void main(String[] args) {
        solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2});
    }

    public static int solution(int[] ingredient) {
        int answer = 0;

        List<Integer> list = Arrays.stream(ingredient).boxed().collect(Collectors.toList());

        System.out.println("list = " + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                List<Integer> subList = list.subList(i + 1, list.size());
                System.out.println("subList = " + subList);
                int nextBread = subList.indexOf(1) + i + 1;
                System.out.println("Bread = " + i);
                System.out.println("nextBread = " + nextBread);
                System.out.println();

                if (list.subList(i, nextBread).contains(2) && list.subList(i, nextBread).contains(3) && list.subList(i, nextBread).indexOf(2) < list.subList(i, nextBread).indexOf(3)) {
                    answer++;
                    i++;
                }
            }
        }

        System.out.println("answer = " + answer);

        return answer;
    }
}

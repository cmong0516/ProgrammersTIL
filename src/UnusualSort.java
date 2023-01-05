import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnusualSort {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 5, 6}, 4);
    }

    public static int[] solution(int[] numlist, int n) {
        List<Integer> answer = new ArrayList<>();

        List<Integer> list = Arrays.stream(numlist).boxed().collect(Collectors.toList());

        System.out.println("list = " + list);

        int temp = 1;

        if (list.contains(n)) {
            answer.add(n);
        }

        while (temp < 10000) {
            System.out.println("n = " + n);


            if (list.contains(n+temp)) {
                answer.add(n+temp);
            }
            if (list.contains(n-temp)) {
                answer.add(n-temp);
            }

            temp++;

        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}


import java.util.Arrays;

public class MakeMaxValue {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 5});
    }

    public static int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        answer = numbers[numbers.length-1] * numbers[numbers.length-2];

        return answer;
    }
}

import java.util.Arrays;

public class MakeBiggistNumber {
    public static void main(String[] args) {
        solution(new int[]{1, 2, -3, 4, -5});
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[0] * numbers[1];

        if (numbers[0] * numbers[1] > numbers[numbers.length - 1] * numbers[numbers.length - 2]) {
            answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] != numbers[j] && numbers[i] * numbers[j] > answer) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }

        return answer;
    }
}


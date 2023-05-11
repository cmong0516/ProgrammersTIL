import java.util.Arrays;
import java.util.Stack;

public class FindAfterBigNumber {
    public static void main(String[] args) {
        solution(new int[]{9, 1, 5, 3, 6, 2});
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {
            if (stack.isEmpty() || numbers[i] < numbers[i - 1]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                    answer[stack.pop()] = numbers[i];
                }
                stack.push(i);
                System.out.println("answer = " + Arrays.toString(answer));
            }

            System.out.println("stack = " + stack);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        System.out.println("answer = " + Arrays.toString(answer));

        return answer;
    }
}

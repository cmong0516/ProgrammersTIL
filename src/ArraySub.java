import java.util.Arrays;

public class ArraySub {
    public static void main(String[] args) {
        solution(new int[]{1,2,3,4,5},1,3);
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];

        for (int i = 0; i < num2-num1+1; i++) {

            answer[i] = numbers[num1+i];
        }

        return answer;
    }
}

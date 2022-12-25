

public class ArrayDouble {
    public static void main(String[] args) {
        Solution.solution(new int[]{1, 2, 3, 4, 5});
    }

    static class Solution {
        public static int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[i] * 2;
            }

            return answer;
        }
    }
}

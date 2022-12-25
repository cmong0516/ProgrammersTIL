public class IceAmericano {
    public static void main(String[] args) {
        Solution.solution(5500);
    }

    static class Solution {
        public static int[] solution(int money) {
            int[] answer = new int[2];

            answer[0] = money/5500;
            answer[1] = money%5500;

            return answer;
        }
    }
}

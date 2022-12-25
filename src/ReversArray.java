import java.util.ArrayList;
import java.util.List;

public class ReversArray {
    public static void main(String[] args) {
        Solution.solution(new int[]{1, 2, 3, 4, 5});
    }

    static class Solution {
        public static int[] solution(int[] num_list) {

            int[] answer = new int[num_list.length];

            for (int i = 0; i < num_list.length; i++) {
                answer[i] = (num_list[num_list.length-1-i]);
            }


            return answer;
        }
    }
}

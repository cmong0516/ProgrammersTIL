public class MakeItTwodimensional {
    public static void main(String[] args) {
        Solution.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8},2);
    }


}


class Solution {
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int index = 0;
        for (int i = 0; i < num_list.length/n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[index];
                index++;
            }
        }

        return answer;
    }
}
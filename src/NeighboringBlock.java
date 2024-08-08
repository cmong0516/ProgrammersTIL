import java.util.Arrays;

public class NeighboringBlock {
    public static void main(String[] args) {
        String[][] board = {
                {"blue", "red", "orange", "red"},
                {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"},
                {"orange", "orange", "red", "blue"}
        };
        int solution = solution(board, 1, 1);
        System.out.println("solution = " + solution);
    }

    public static int solution(String[][] board, int h, int w) {
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        int answer = 0;

        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if (h_check >= 0 && h_check < board.length && w_check >= 0 && w_check < board[0].length) {
                if (board[h][w].equals(board[h_check][w_check])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}

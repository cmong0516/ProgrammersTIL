import java.util.Arrays;

public class LargestSquare {
    public static void main(String[] args) {
        int[][] a = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};
        solution(a);
    }

    public static int solution(int[][] board) {
        int answer = 1234;

        int[][] arr = new int[board.length + 1][board[0].length + 1];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                arr[i + 1][j + 1] = board[i][j];
            }
        }

        int max = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    int left = arr[i - 1][j];
                    int up = arr[i][j - 1];
                    int leftUp = arr[i - 1][j - 1];
                    int min = Math.min(left, Math.min(up, leftUp));

                    arr[i][j] = min +1;
                    max = Math.max(max, min + 1);
                }
            }
        }

        answer = max * max;

        return answer;
    }
}

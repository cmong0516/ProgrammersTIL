import java.util.Arrays;

public class SafeArea {
    public static void main(String[] args) {
        int[][] a = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        solution(a);
    }

    public static int solution(int[][] board) {
        int answer = 0;

        int[][] copyBoard = new int[board.length][board[0].length];

        int tempIndex = 0;

        for (int[] ints : board) {
            copyBoard[tempIndex] = Arrays.copyOf(ints, board[tempIndex].length);
            tempIndex++;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int value = board[i][j];

                if (value == 0) {
                    continue;
                }

                adjacent(i, j, 1, copyBoard);
            }
        }

        for (int[] ints : copyBoard) {
            for (int anInt : ints) {
                if (anInt == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }

    static void adjacent(int row, int col, int range, int[][] board) {
        for (int r = row - 1; r <= row + 1; r++) {
            if (r < 0 || r >= board.length) {
                continue;
            }
            for (int c = col - 1; c <= col + 1; c++) {
                if (c < 0 || c >= board[0].length) {
                    continue;
                }

                board[r][c] = 1;
            }
        }
    }

}


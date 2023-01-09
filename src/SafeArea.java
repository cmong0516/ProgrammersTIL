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

                System.out.println("board[i][j] = " + board[i][j]);
            }
        }

        return answer;
    }

    static void dfs(int[][] board, boolean[][] visited, int x, int y) {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        boolean[][] temp = visited.clone();

        if (x == -1 || y == -1) {
            return;
        }
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (!visited[nx][ny] && board[nx][ny] == 0) {
                dfs(board, visited, nx, ny);
                visited[nx][ny] = false;
            }
        }
    }

}

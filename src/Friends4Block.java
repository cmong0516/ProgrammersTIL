import java.util.LinkedList;
import java.util.Queue;

public class Friends4Block {

    static boolean[][] v;

    public static void main(String[] args) {
        solution(4, 5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"});
    }

    public static int solution(int m, int n, String[] board) {
        int answer = 0;

        char[][] charBoard = makeCharBoard(board);



        boolean flag = true;

        while (flag) {
            v = new boolean[m][n];
            flag = false;
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (charBoard[i][j] == '#') {
                        continue;
                    }

                    if (check(i, j, charBoard)) {
                        v[i][j] = true;
                        v[i + 1][j] = true;
                        v[i][j + 1] = true;
                        v[i + 1][j + 1] = true;
                        flag = true;
                    }
                }
            }
            answer += removeBlock(m, n, charBoard);
            v = new boolean[m][n];
        }

        System.out.println("answer = " + answer);

        return answer;
    }

    public static int removeBlock(int m, int n, char[][] board) {
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (v[i][j]) {
                    board[i][j] = '.';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            Queue<Character> queue = new LinkedList<>();
            for (int j = m-1; j >= 0; j--) {
                if (board[i][j] == '.') {
                    cnt++;
                } else {
                    queue.add(board[i][j]);
                }
            }
            int index = m-1;

            while (!queue.isEmpty()) {
                board[index--][i] = queue.poll();
            }

            for (int j = index; j >= 0 ; j--) {
                board[i][j] = '#';
            }

        }

        return cnt;
    }

    public static char[][] makeCharBoard(String[] board) {
        char[][] result = new char[board.length][board[0].length()];

        for (int i = 0; i < board.length; i++) {
            result[i] = board[i].toCharArray();
        }

        return result;
    }

    public static boolean check(int a, int b, char[][] board) {
        char c = board[a][b];
        if (c == board[a + 1][b] && c == board[a + 1][b + 1] && c == board[a][b + 1]) {
            return true;
        }
        return false;
    }
}

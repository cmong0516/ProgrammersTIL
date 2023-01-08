public class SafeArea {
    public static void main(String[] args) {
        int[][] a = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        solution(a);
    }

    public static int solution(int[][] board) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // 00 01 02 03 04
                // 10 11 12 13 14
                // 20 21 22 23 24
                // 30 31 32 33 34
                // 40 41 42 43 44

                if (board[i][j] != 1) {
                    if (board[i][j - 1] != 1 && board[i][j + 1] != 1 && board[i + 1][j - 1] != 1
                            && board[i + 1][j] != 1 && board[i + 1][j + 1] != 1) {
                        answer++;
                    }
                    if (j == 0) {

                    }
                }

            }
        }
        System.out.println("answer = " + answer);

        return answer;
    }
}

//   왼위     && board[i][j - 1] != 1
//   위     && board[i][j + 1] != 1
//   오른위     && board[i + 1][j - 1] != 1
//   왼     && board[i + 1][j] != 1
//   오     && board[i + 1][j + 1] != 1
//   왼아래     && board[i - 1][j - 1] != 1
//   아래     && board[i - 1][j] != 1
//   오른아래     && board[i - 1][j + 1] != 1
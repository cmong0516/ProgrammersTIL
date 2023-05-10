public class Friends4Block {
    public static void main(String[] args) {
        solution(4, 5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"});
    }

    public static int solution(int m, int n, String[] board) {
        int answer = 0;

        char[][] charBoard = makeCharBoard(board);

        return answer;
    }

    public static char[][] makeCharBoard(String[] board) {
        char[][] result = new char[board.length][board[0].length()];

        for (int i = 0; i < board.length; i++) {
            result[i] =board[i].toCharArray();
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

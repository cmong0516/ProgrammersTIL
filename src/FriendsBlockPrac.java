import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FriendsBlockPrac {

    static int answer = 0;
    static char[][] map;

    public static void main(String[] args) {
        solution(4, 5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"});
    }

    public static boolean updateBlocks(int m, int n) {
        boolean[][] visit = new boolean[m][n];
        int cnt = 0;

        isVisit(m,n,visit);

        for (int i = 0; i < n; i++) {
            List<Character> temp = new ArrayList<>();

            for (int j = m-1; j >= 0; j--) {
                if (visit[j][i]) {
                    cnt++;
                    continue;
                }

                temp.add(map[j][i]);
            }

            for (int j = m-1,k=0; j >= 0 ; j--,k++) {
                if (k < temp.size()) {
                    map[j][i] = temp.get(k);
                } else {
                    map[j][i] = '0';
                }
            }
        }

        answer += cnt;

        return cnt > 0;
    }

    public static void isVisit(int m, int n, boolean[][] visit) {
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (map[i][j] == '0') {
                    continue;
                }

                if (check(i, j)) {
                    visit[i][j] = true;
                    visit[i+1][j] = true;
                    visit[i][j+1] = true;
                    visit[i+1][j+1] = true;
                }
            }
        }
    }

    public static int solution(int m, int n, String[] board) {

        char[][] map = makeBoard(m, n, board);

        while (updateBlocks(m,n)) {
        }

        return answer;
    }

    public static boolean check(int i, int j) {
        char c = map[i][j];

        return map[i + 1][j] == c && map[i][j + 1] == c && map[i + 1][j + 1] == c;
    }

    public static char[][] makeBoard(int m, int n, String[] board) {

        map = new char[m][n];

        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }

        return map;
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class SplittingPowerGridInTwo {

    static int [][] map;

    public static void main(String[] args) {

        int[][] arr = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};

        System.out.println(solution(9,arr));
    }

    public static int solution(int n, int[][] wires) {
        int answer = n;

        map = new int[n + 1][n + 1];

        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0];
            int b = wires[i][1];
            map[a][b] = 1;
            map[b][a] = 1;
        }

        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0];
            int b = wires[i][1];

            map[a][b] = 0;
            map[b][a] = 0;

            answer = Math.min(answer, bfs(n, i + 1));

            map[a][b] = 1;
            map[b][a] = 1;
        }

        return answer;
    }

    public static int bfs(int n, int start) {
        int cnt = 1;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] check = new boolean[n + 1];
        queue.add(start);
        check[start] = true;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i = 0; i <= n; i++) {
                if (map[now][i] == 1 && !check[i]) {
                    queue.add(i);
                    check[i] = true;
                    cnt++;
                }
            }
        }
        return Math.abs(n - 2 * cnt);
    }
}

import java.util.Arrays;

public class Fatigue {

    static int count = 0;
    static boolean[] visited;

    public static void main(String[] args) {
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        solution(80,dungeons);
    }

    public static int solution(int k, int[][] dungeons) {
        // 최소 필요 피로도
        // 소모 피로도

        // DFS

        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);

        return count;
    }

    public static void dfs(int depth, int fatigue, int[][] dungeons) {

        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] || dungeons[i][0] > fatigue) {
                continue;
            }

            visited[i] = true;
            dfs(depth + 1, fatigue - dungeons[i][1], dungeons);
            visited[i] = false;
        }

        count = Math.max(count, depth);
    }
}
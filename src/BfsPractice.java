import java.util.LinkedList;
import java.util.Queue;

public class BfsPractice {
    public static void main(String[] args) {
        int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

        boolean[] visited = new boolean[graph.length];
        System.out.println(bfs(1,graph,visited));
    }

    public static String bfs(int start,int[][]graph,boolean[]visited) {

        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);

        visited[start] = true;

        while (!queue.isEmpty()) {
            int nodeIndex = queue.poll();
            sb.append(nodeIndex).append(" -> ");

            for (int i = 0; i < graph[nodeIndex].length; i++) {
                int temp = graph[nodeIndex][i];

                if (!visited[temp]) {
                    visited[temp]= true;
                    queue.offer(temp);
                }
            }
        }
        return sb.toString();
    }
}
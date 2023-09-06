import java.util.LinkedList;
import java.util.Queue;

public class RicochatBot {
    public static void main(String[] args) {
        int solution = solution(new String[]{"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."});
        System.out.println("solution = " + solution);
    }

    public static int solution(String[] board) {
        int answer = 0;

        String[][] map = new String[board.length][board[0].length()];
        boolean[][] visited = new boolean[board.length][board[0].length()];
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int[] start = new int[2];

        for (int i = 0; i < board.length; i++) {
            map[i] = board[i].split("");
            for (int j = 0; j < map[i].length; j++) {
                // 시작점 체크
                if (map[i][j].equals("R")) {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        // 시작점 y , x , count
        queue.add(new int[]{start[0], start[1], 1});
        // 시작점 방문
        visited[start[0]][start[1]] = true;

        // 큐 값이 있다면
        while (!queue.isEmpty()) {
            int[] q = queue.poll();
            int y = q[0];
            int x = q[1];
            int cnt = q[2];

            for (int i = 0; i < 4; i++) {
                int nx = x;
                int ny = y;


                // 끝까지 이동
                while (true) {

                    // 맵 밖으로 나갈시
                    if (ny < 0 || ny >= map.length || nx < 0 || nx >= map[0].length) {
                        break;
                    }

                    // 장애물 만날시 break
                    if (map[ny][nx].equals("D")) {
                        nx -= dx[i];
                        ny -= dy[i];
                        break;
                    }

                    // 그외 상 하 좌 위 움직임

                    nx += dx[i];
                    ny += dy[i];
                }


                // 맵 밖으로 나갈경우 직전 위치로 조정.
                if (ny < 0 || ny >= map.length || nx < 0 || nx >= map[0].length) {
                    if (i == 0) {
                        nx = map[0].length - 1;
                    } else if (i == 1) {
                        nx = 0;
                    } else if (i == 2) {
                        ny = map.length - 1;
                    } else {
                        ny = 0;
                    }
                }

                // 목적지 도착
                if (map[ny][nx].equals("G")) {
                    return cnt;
                }

                // 방문하지 않은 곳일경우
                // 큐에 현재 위치값 , count++ 추가

                if (!visited[ny][nx]) {
                    queue.add(new int[]{ny, nx, cnt+1});
                    visited[ny][nx] = true;
                }
            }

        }

        return -1;
    }
}

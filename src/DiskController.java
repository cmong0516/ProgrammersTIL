import java.util.Arrays;
import java.util.PriorityQueue;

public class DiskController {
    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        solution(jobs);
    }

    public static int solution(int[][] jobs) {
        // 요청시간 , 소요시간 에 대한 배열이 주어진다.
        // 먼저 처리하던 작업을 완료하고 다음 작업을 수행하는데
        // 완료시간 - 요청시간 의 총합 / 작업의수 를 최소로 만들어라.
        // 작업의 수는 같으니 완료시간 - 시작시간 순으로 정렬

        int answer = 0;
        int end = 0;
        int jobsIndex = 0;
        int count = 0;

        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(((o1, o2) -> o1[1] - o2[1]));

        while (count < jobs.length) {

            while (jobsIndex < jobs.length && jobs[jobsIndex][0] <= end) {
                priorityQueue.add(jobs[jobsIndex++]);
            }

            if (priorityQueue.isEmpty()) {
                end = jobs[jobsIndex][0];
            } else {
                int[] temp = priorityQueue.poll();
                answer += temp[1] + end - temp[0];
                end += temp[1];
                count++;
            }
        }

        return (int) Math.floor(answer / jobs.length);
    }
}

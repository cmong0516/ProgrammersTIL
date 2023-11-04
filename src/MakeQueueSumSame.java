import java.util.LinkedList;
import java.util.Queue;

public class MakeQueueSumSame {
    public static void main(String[] args) {
        solution(new int[]{3, 2, 7, 2,}, new int[]{4, 6, 5, 1});
    }

    public static int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }

        long sum1 = sum(queue1);
        long sum2 = sum(queue2);

        while (sum1 != sum2) {
            if (answer > (queue1.length + queue2.length) * 2) {
                return -1;
            }

            int value = 0;

            if (sum1 < sum2) {
                value = q2.poll();
                q1.add(value);
                sum1 += value;
                sum2 -= value;
            } else if (sum1 > sum2) {
                value = q1.poll();
                q2.add(value);
                sum1 -= value;
                sum2 += value;
            } else {
                return answer;
            }

            answer++;
        }

        return answer;
    }

    public static long sum(int[] q) {
        long sum = 0;
        for (int i = 0; i < q.length; i++) {
            sum += q[i];
        }

        return sum;
    }
}

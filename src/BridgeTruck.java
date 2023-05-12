import java.util.LinkedList;
import java.util.Queue;

public class BridgeTruck {
    public static void main(String[] args) {
        solution(2, 10, new int[]{7,4,5,6});
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        int answer = 1;

        Queue<Integer> queue = new LinkedList<>();

        int sum = 0;

        for (int t : truck_weights) {

            while (true) {
                System.out.println(t);
                System.out.println(sum);
                System.out.println("queue = " + queue);

                if (queue.isEmpty()) {
                    queue.offer(t);
                    sum += t;
                    answer++;
                    break;
                } else if (queue.size() == bridge_length) {
                    sum -= queue.poll();


                } else {
                    if (sum + t > weight) {
                        queue.offer(0);
                        answer++;
                    } else {
                        queue.offer(t);
                        sum += t;
                        answer++;
                        break;
                    }
                }
            }
        }

        System.out.println("answer = " + answer);
        System.out.println("bridge_length = " + bridge_length);

        return answer;
    }
}

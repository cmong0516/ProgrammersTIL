import java.util.Stack;

public class ParcelBox {
    public static void main(String[] args) {
        solution(new int[]{5, 4, 3, 2, 1});
    }

    public static int solution(int[] order) {
        int answer = 0;

        // 보조 컨테이너 벨트에 마지막으로 넣은 상자부터 꺼낸다 : 스택!

        Stack<Integer> stack = new Stack<>();

        int current = 1;
        int index = 0;

        while (true) {

            if (!stack.isEmpty() && order[index] == stack.peek()) {
                answer++;
                index++;
                stack.pop();
                continue;
            }

            if (current > order.length) {
                break;
            }

            if (order[index] == current) {
                answer++;
                index++;
                current++;
                continue;
            }

            stack.push(current);
            current++;

        }

        System.out.println("answer = " + answer);

        return answer;
    }
}

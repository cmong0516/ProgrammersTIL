import java.util.Stack;

public class MakeHamburger {
    public static void main(String[] args) {
        solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2});
    }

    public static int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> hamberger = new Stack<>();

        for (int i : ingredient) {
            if (i == 1 && hamberger.size() >= 3 && hamberger.lastIndexOf(3) == hamberger.size() - 1
                    && hamberger.lastIndexOf(2) == hamberger.size() - 2
                    && hamberger.lastIndexOf(1) == hamberger.size() - 3) {
                answer++;
                hamberger.pop();
                hamberger.pop();
                hamberger.pop();
            } else {
                hamberger.add(i);
            }
        }

        return answer;
    }
}

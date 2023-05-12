import java.util.HashSet;

public class ChangeNumber {
    public static void main(String[] args) {
        solution(5, 40, 10);
    }

    public static int solution(int x, int y, int n) {
        int answer = 0;

        // 1.x+n
        // 2. x*2
        // 3. x*3

        HashSet<Integer> set = new HashSet<>(), next = null;

        set.add(x);

        while (!set.isEmpty()) {
            if (set.contains(y)) {
                return answer;
            }

            next = new HashSet<>();
            for (Integer integer : set) {
                int val1 = integer + n;
                int val2 = integer * 2;
                int val3 = integer * 3;

                if (val1 <= y) {
                    next.add(val1);
                }
                if (val2 <= y) {
                    next.add(val2);
                }
                if (val3 <= y) {
                    next.add(val3);
                }
            }

            set = next;

            answer++;
        }

        return -1;
    }
}

// 5 7 9 10 11 14 15 16
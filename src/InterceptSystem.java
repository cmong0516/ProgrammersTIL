import java.util.Arrays;

public class InterceptSystem {
    public static void main(String[] args) {
        int[][] targets = {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}};
        solution(targets);
    }

    public static int solution(int[][] targets) {
        int answer = 0;

        Arrays.sort(targets, ((o1, o2) -> {
            return o1[1] - o2[1];
        }));

        int last = -1;
        for (int[] target : targets) {
            if (last == -1) {
                answer++;
                last = target[1] -1;
                continue;
            }

            if (last >= target[0] && last <= target[1]) {
                continue;
            }

            answer++;
            last = target[1] -1;
        }

        System.out.println("answer = " + answer);


        return answer;
    }
}

import java.util.ArrayList;

public class TowerOfHanoi {
    static ArrayList<int[]> seq;
    public static void main(String[] args) {
        solution(2);
    }

    public static int[][] solution(int n) {
        seq = new ArrayList<>();

        hanoi(n,1,3,2);

        int[][] answer = new int[seq.size()][2];

        for (int i = 0; i < seq.size(); i++) {
            int[] cmd = seq.get(i);
            answer[i][0] = cmd[0];
            answer[i][1] = cmd[1];
        }

        return answer;
    }

    static void hanoi(int n, int from, int to, int via) {
        int[] move = {from, to};

        if (n == 1) {
            seq.add(move);
        }
        if (n != 1) {
            hanoi(n - 1, from, via, to);
            seq.add(move);
            hanoi(n - 1, via, to, from);
        }
    }
}

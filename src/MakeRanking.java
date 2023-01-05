import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MakeRanking {
    public static void main(String[] args) {
        int[][] a = {{1,2},{1,1},{1,1}};
        solution(a);
    }

    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for (int[] ints : score) {

            list.add((ints[0] + ints[1]) / 2 + (ints[0] + ints[1]) % 2);

        }

        Collections.sort(list);
        Collections.reverse(list);


        for (int i = 0; i < score.length; i++) {
            int index = list.indexOf((score[i][0] + score[i][1]) / 2 + (score[i][0] + score[i][1]) % 2);
            answer[i] = index+1;
        }


        return answer;
    }
}


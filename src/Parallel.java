import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parallel {
    public static void main(String[] args) {
        int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        solution(dots);
    }

    public static int solution(int[][] dots) {
        int answer = 0;
        int x = 0;
        int y = 0;

        List<Double> list = new ArrayList<>();

        for (int i = 0; i < dots.length; i++) {
            for (int j = i+1; j < dots.length; j++) {

                x = dots[i][0] - dots[j][0];
                y = dots[i][1] - dots[j][1];

                System.out.println("dots[i][0] - dots[j][0] = " + (dots[i][0] - dots[j][0]));
                System.out.println("dots[i][1] - dots[j][1] = " + (dots[i][1] - dots[j][1]));
                System.out.println();

                double tilt =  (double)x / y;



                list.add(tilt);
            }
        }

        for (double d : list) {
            if (Collections.frequency(list, d) > 1) {
                answer = 1;
            }
        }



        return answer;
    }
}

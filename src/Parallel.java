public class Parallel {
    public static void main(String[] args) {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        solution(dots);
    }

    public static int solution(int[][] dots) {
        int answer = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < dots.length; i++) {
            System.out.println("i = " + i);

            for (int j = i+1; j < dots.length; j++) {
                System.out.println("j = " + j);
                x = dots[i][0] - dots[j][0];
                y = dots[i][1] - dots[j][1];
                System.out.println("x = " + x);
                System.out.println();
                System.out.println("y = " + y);
                System.out.println();
            }
        }


        return answer;
    }
}

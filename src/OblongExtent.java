public class OblongExtent {
    public static void main(String[] args) {
        int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        solution(dots);
    }

    public static int solution(int[][] dots) {
        int answer = 0;
        int maxX = dots[0][0];
        int minX = dots[0][0];
        int maxY = dots[0][1];
        int minY = dots[0][1];

        for (int[] dot : dots) {
            if (maxX < dot[0]) {
                maxX = dot[0];
            }
            if (minX > dot[0]) {
                minX = dot[0];
            }
            if (maxY < dot[1]) {
                maxY = dot[1];
            }
            if (minY > dot[1]) {
                minY = dot[1];
            }
        }

        return (maxX-minX)*(maxY-minY);
    }
}

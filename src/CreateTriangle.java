import java.util.Arrays;

public class CreateTriangle {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3});
    }

    public static int solution(int[] sides) {
        int answer = 2;

        Arrays.sort(sides);

        if (sides[2] < sides[0] + sides[1]) {
            answer = 1;
        }

        return answer;
    }
}

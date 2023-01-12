import java.util.Arrays;

public class FoodFight {
    public static void main(String[] args) {
        solution(new int[]{1, 7, 1, 2});
    }

    public static String solution(int[] food) {
        String answer = "";

        StringBuilder sb = new StringBuilder();

        System.out.println(Arrays.toString(food));

        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 != 0) {
                food[i] -= 1;
            }
            if (food[i] != 0) {
                sb.append(String.valueOf(i).repeat(food[i]/2));
            }

        }
        System.out.println("sb = " + sb);
        answer+=sb;
        System.out.println("answer = " + answer);
        answer += "0";
        System.out.println("answer = " + answer);
        answer += sb.reverse();
        System.out.println("answer = " + answer);
        System.out.println("answer = " + answer);

        return answer;
    }
}
import java.util.Arrays;

public class ParkWalk {
    public static void main(String[] args) {

        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};

        solution(park,routes);
    }

    public static int[] solution(String[] park, String[] routes) {

        int a = 0;
        int b = 0;
        boolean c = true;

        for (String s : park) {
            String[] split = s.split("");
            for (String s1 : split) {
                if (s1.equals("S")) {
                    c = false;
                    break;
                }
                b++;
            }

            if (c == false) {
                break;
            }
            a++;
        }

        return null;
    }
}



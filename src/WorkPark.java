import java.util.Arrays;

public class WorkPark {
    static char[][] map;

    public static void main(String[] args) {
        solution(new String[]{"SOO", "OOO", "OOO"}, new String[]{"E 2", "S 2", "W 1"});
    }

    public static int[] solution(String[] park, String[] routes) {
        map = new char[park.length][park[0].length()];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                map[i][j] = park[i].charAt(j);
            }
        }

        for (char[] chars : map) {
            System.out.println("chars = " + Arrays.toString(chars));
        }

        return null;
    }

    public int[] move(String[] routes) {

        for (String route : routes) {
            String[] split = route.split(" ");
            String direction = split[0];
            int distance = Integer.parseInt(split[1]);

        }

        return null;
    }

    public boolean isOverMap(String direction, int distance) {
        return true;
    }
}

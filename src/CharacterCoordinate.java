import java.util.Arrays;

public class CharacterCoordinate {
    public static void main(String[] args) {
        solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{9,9});
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];

        for (String s : keyinput) {
            if (s.equals("up") && board[1]/2 > answer[1]) {
                answer[1]++;
            }
            if (s.equals("down") && board[1]/2 > -answer[1]) {
                answer[1]--;
            }
            if (s.equals("left") && board[0]/2 > -answer[0]) {
                answer[0]--;
            }
            if (s.equals("right") && board[0]/2 > answer[0]) {
                answer[0]++;
            }

        }

        return answer;
    }
}

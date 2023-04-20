import java.util.HashMap;
import java.util.Map;

public class RunningRace {

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        solution(players, callings);
    }

    public static String[] solution(String[] players, String[] callings) {

        Map<String, Integer> rank = new HashMap<>();

        int i = 0;

        for (String player : players) {
            rank.put(player,i);
            i++;
        }

        for (String calling : callings) {
            Integer currentRank = rank.get(calling);
            String frontPlayer = players[currentRank - 1];

            players[currentRank -1] = calling;
            players[currentRank] = frontPlayer;

            rank.put(calling,currentRank-1);
            rank.put(frontPlayer,currentRank);
        }

        return players;
    }
}
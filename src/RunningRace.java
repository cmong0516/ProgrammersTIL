import java.util.List;

public class RunningRace {

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings ={"kai", "kai", "mine", "mine"};
        solution(players,callings);
    }

    public static String[] solution(String[] players, String[] callings) {

        List<String> playerList = new java.util.ArrayList<>(List.of(players));

        for (String calling : callings) {
            int i = playerList.indexOf(calling);
            String temp = playerList.get(i-1);
            playerList.set(i-1,calling);
            playerList.set(i,temp);
        }

        return playerList.toArray(new String[playerList.size()]);
    }
}

import java.util.HashMap;
import java.util.Map;

public class MostReceivedGift {
    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        int answer = solution(friends, gifts);
        System.out.println("answer = " + answer);
    }

    public static int solution(String[] friends, String[] gifts) {

        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();

        for (String from : friends) {
            HashMap<String, Integer> friend = new HashMap<>();
            for (String to : friends) {
                friend.put(to, 0);
            }
            map.put(from, friend);
        }

        for (String gift : gifts) {
            String[] split = gift.split(" ");
            String from = split[0];
            String to = split[1];

            HashMap<String, Integer> friend = map.get(from);
            friend.put(from, friend.get(from) + 1);
        }

        System.out.println("map = " + map);

        return 0;
    }
}

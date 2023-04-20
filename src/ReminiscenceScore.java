import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReminiscenceScore {

    public static void main(String[] args) {

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        solution(name,yearning,photo);
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {

        List<Integer> result = new ArrayList<>();

        for (String[] strings : photo) {
            int score = 0;
            for (String s : name) {
                if (List.of(strings).contains(s)) {
                    System.out.println(s);
                    int nameIndex = List.of(name).indexOf(s);
                    score += Arrays.stream(yearning).boxed().collect(Collectors.toList()).get(nameIndex);
                }
            }
            result.add(score);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

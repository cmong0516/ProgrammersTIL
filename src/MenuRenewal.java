import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuRenewal {
    static List<String> answerList = new ArrayList<>();
    static Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4});
    }

    public static String[] solution(String[] orders, int[] course) {

        for (int i = 0; i < orders.length; i++) {
            orders[i] = sortString(orders[i]);
        }

        for (int courseLength : course) {
            for (String order : orders) {
                combination("", order, courseLength);
            }

            if (!map.isEmpty()) {
                ArrayList<Integer> countList = new ArrayList<>(map.values());
                int max = Collections.max(countList);

                if (max > 1) {
                    for (String key : map.keySet()) {
                        if (map.get(key) == max) {
                            answerList.add(key);
                        }
                    }
                }
                map.clear();
            }
        }

        Collections.sort(answerList);
        String[] answer = new String[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static String sortString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void combination(String order, String others, int count) {
        System.out.println("order = " + order);
        System.out.println("others = " + others);
        System.out.println("count = " + count);
        if (count == 0) {
            map.put(order, map.getOrDefault(order, 0) + 1);
            return;
        }

        for (int i = 0; i < others.length(); i++) {
            combination(order + others.charAt(i) , others.substring(i+1) , count-1);
        }
    }
}
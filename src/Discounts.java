import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Discounts {
    public static void main(String[] args) {

        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice",
                "pot", "banana", "apple", "banana"};
        solution(want, number, discount);
    }
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = makeWantMap(want, number);

        System.out.println("wantMap = " + wantMap);

        List<String[]> discountList = makeDiscountList(discount);

        for (String[] strings : discountList) {
            Map<String, Integer> map = new HashMap<>();
            for (String string : strings) {
                map.put(string, map.getOrDefault(string, 0)+1);
            }
            System.out.println("map = " + map);

            int check = 0;

            for (String s : map.keySet()) {
                System.out.println("map.get(s) = " + map.get(s));
                System.out.println("wantMap.get(s) = " + wantMap.get(s));

                if (map.get(s) == wantMap.get(s)) {
                    check++;
                }
            }

            if (check == want.length) {
                answer++;
            }
        }

        return answer;
    }

    public static Map<String, Integer> makeWantMap(String[] want, int[] number) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        return map;
    }

    public static List<String[]> makeDiscountList(String[] discount) {
        List<String[]> result = new ArrayList<>();
        for (int i = 0; i < discount.length-9; i++) {
            result.add(Arrays.copyOfRange(discount, i, i + 10));
        }

        return result;
    }

}

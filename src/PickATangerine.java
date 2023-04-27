import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PickATangerine {
    public static void main(String[] args) {
        solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : tangerine) {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        System.out.println("map = " + map);

        ArrayList<Integer> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });

        for (Integer integer : keyList) {
            if (k <= 0) {
                break;
            }
            answer++;
            k -= map.get(integer);
        }

        System.out.println("answer = " + answer);
        return answer;
    }
}

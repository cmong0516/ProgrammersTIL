import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Costume {
    public static void main(String[] args) {


        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        solution(clothes);
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            map.put(clothe[1],map.getOrDefault(clothe[1],0)+1);
        }

        for (Integer value : map.values()) {
            answer *= (value+1);
        }

        return answer-1;
    }
}

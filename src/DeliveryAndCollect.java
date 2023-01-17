import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DeliveryAndCollect {
    public static void main(String[] args) {
        solution(4, 5, new int[]{1, 0, 3, 1, 2}, new int[]{0, 3, 0, 4, 0});
    }

    public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = -1;

        List<Integer> deliveriesList = Arrays.stream(deliveries).boxed().collect(Collectors.toList());
        List<Integer> pickupsList = Arrays.stream(pickups).boxed().collect(Collectors.toList());

        Collections.reverse(deliveriesList);
        Collections.reverse(pickupsList);

        System.out.println("deliveriesList = " + deliveriesList);
        System.out.println("pickupsList = " + pickupsList);

        int total = 0;

        for (int i = 0; i < deliveriesList.size(); i++) {
            total += deliveriesList.get(i);
            if (total == cap) {
                System.out.println("i = " + i);
            }
        }

        return answer;
    }
}

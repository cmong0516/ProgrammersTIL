import java.util.ArrayList;
import java.util.List;

public class RotationArray {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3}, "right");
    }

    public static int[] solution(int[] numbers, String direction) {

        List<Integer> list = new ArrayList<>();

        for (int number : numbers) {
            list.add(number);
        }

        if (direction.equals("right")) {
            list.remove(list.size()-1);
            list.add(0,numbers[numbers.length-1]);
        }

        if (direction.equals("left")) {
            list.remove(0);
            list.add(numbers[0]);
        }


        return list.stream().mapToInt(i -> i).toArray();
    }
}


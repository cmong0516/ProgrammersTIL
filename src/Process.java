import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Process {
    public static void main(String[] args) {
        solution(new int[]{2, 1, 3, 2}, 2);
    }

    public static int solution(int[] priorities, int location) {

        Queue<Character> queue = new LinkedList<>();

        char a = 'A';

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) {
            list.add((char) (a + i));
        }

        List<Integer> prioritiesList = Arrays.stream(priorities).boxed().collect(Collectors.toList());

        Collections.sort(prioritiesList);
        Collections.reverse(prioritiesList);

        System.out.println("prioritiesList = " + prioritiesList);

        List<Character> result = new ArrayList<>();

        queue.addAll(list);

        while (!queue.isEmpty()) {
            if (priorities[list.indexOf(queue.peek())] >= prioritiesList.get(0)) {
                result.add(queue.peek());
                queue.poll();
                prioritiesList.remove(0);
            } else {
                Character poll = queue.poll();
                queue.offer(poll);
            }
        }

        return result.indexOf(list.get(location))+1;
    }
}
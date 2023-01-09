import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DuplicateLine {
    public static void main(String[] args) {
        int[][] lines = {{-1, 1}, {1, 3}, {3, 9}};
        solution(lines);
    }

    public static int solution(int[][] lines) {
        int answer = 0;
        

        List<Integer> line1 = new ArrayList<>();
        List<Integer> line2 = new ArrayList<>();
        List<Integer> line3 = new ArrayList<>();

        List<List<Integer>> linesList = new ArrayList<>();
        linesList.add(line1);
        linesList.add(line2);
        linesList.add(line3);

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                linesList.get(i).add(j);
            }
        }

        for (Integer integer : line1) {
            if (line2.contains(integer)) {
                set.add(integer);
            }
        }

        for (Integer integer : line2) {
            if (line3.contains(integer)) {
                set.add(integer);
            }
        }

        for (Integer integer : line3) {
            if (line1.contains(integer)) {
                set.add(integer);
            }
        }




        System.out.println("line1 = " + line1);
        System.out.println("line2 = " + line2);
        System.out.println("line3 = " + line3);
        System.out.println();
        System.out.println("set.size() = " + set.size());

        answer = set.size()-1;

        
        

        return answer;
    }
}

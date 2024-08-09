import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DataAnalysis {
    public static void main(String[] args) {
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        solution(data, "date", 20300501, "remain");
    }

    public static int[][] solution(int[][] data , String ext, int val_ext, String sort_by) {
        Map<String ,Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        int[][] filteredDate = Arrays.stream(data).filter(x -> x[map.get(ext)] < val_ext).toArray(int[][]::new);
        Arrays.sort(filteredDate, ((o1, o2) -> o1[map.get(sort_by)] - o2[map.get(sort_by)]));

        return filteredDate;
    }
}

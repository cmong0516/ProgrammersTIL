import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class SortString {
    public static void main(String[] args) {
        solution("hi12392");
    }
    public static int[] solution(String my_string) {

        Pattern pt = Pattern.compile("^[0-9]*$");
        List<Integer> list = new ArrayList<>();

        String[] split = my_string.split("");

        for (String s : split) {
            if (pt.matcher(s).matches()) {
                list.add(Integer.parseInt(s));
            }
        }

        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}

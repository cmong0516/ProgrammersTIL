import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tuple {
    public static void main(String[] args) {
        solution("{{20,111},{111}}"	);
    }

    public static int[] solution(String s) {
        List<Integer> result = new ArrayList<>();

        String r = "},{";

        String substring1 = s.substring(0,s.length()-2);
        String substring2 = substring1.substring(2, substring1.length());
        String s1 = substring2.replace(r, "-");

        List<String> collect = Arrays.stream(s1.split("-")).collect(Collectors.toList());

        collect.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        for (String s2 : collect) {
            if (result.isEmpty()) {
                result.add(Integer.valueOf(s2));
            } else {
                List<Integer> splitCollect = Arrays.stream(s2.split(",")).map(Integer::valueOf)
                        .collect(Collectors.toList());

                splitCollect.removeAll(result);
                result.addAll(splitCollect);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}

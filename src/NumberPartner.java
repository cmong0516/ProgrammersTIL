import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberPartner {
    public static void main(String[] args) {
        solution("12321", "42531");
    }

    public static String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();

        List<String> xList = Arrays.asList(X.split(""));
        List<String> yList = Arrays.asList(Y.split(""));
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int min = Math.min(Collections.frequency(xList, String.valueOf(i)),
                    Collections.frequency(yList, String.valueOf(i)));
            if (min != 0) {
                for (int j = 0; j < min; j++) {
                    list.add(String.valueOf(i));
                }

            }
        }

        if (list.size() == 0) {
            return "-1";
        }

        Collections.sort(list);
        Collections.reverse(list);

        for (String s : list) {
            sb.append(s);
        }

        if (String.valueOf(sb).startsWith("0")) {
            return "0";
        }

        return String.valueOf(sb);
    }
}

// 11 ~ 15 timeOver
// use StringBuilder
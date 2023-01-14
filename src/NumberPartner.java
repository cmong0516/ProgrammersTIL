import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberPartner {
    public static void main(String[] args) {
        solution("12321","42531");
    }

    public static String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();

        List<String> xList = Arrays.asList(X.split(""));
        List<String> yList = Arrays.asList(Y.split(""));
        List<String> list = new ArrayList<>();
        for (String s : xList) {
            if (yList.contains(s) && Math.min(Collections.frequency(xList, s), Collections.frequency(yList, s))
                    > Collections.frequency(list, s)) {
                list.add(s);
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberPartner {
    public static void main(String[] args) {
        solution("12321","42531");
    }

    public static String solution(String X, String Y) {
        String answer = "";

        String[] splitX = X.split("");
        String[] splitY = Y.split("");

        List<String> xList = Arrays.asList(splitX);
        List<String> yList = Arrays.asList(splitY);
        List<Integer> list = new ArrayList<>();

        System.out.println("xList = " + xList);
        System.out.println("yList = " + yList);

        for (String s : xList) {
            System.out.println("yList.contains(s) = " + yList.contains(s));
            long xListS = Collections.frequency(xList, s);
            long yListS = Collections.frequency(yList, s);
            long listS = Collections.frequency(list, Integer.parseInt(s));

            System.out.println("Math.min(xListS,yListS) = " + Math.min(xListS, yListS));
            System.out.println("listS = " + listS);
            if (yList.contains(s) && Math.min(xListS, yListS) > listS) {
                list.add(Integer.parseInt(s));
            }
        }

        System.out.println("list = " + list);

        if (list.size() == 0) {
            return "-1";
        }

        Collections.sort(list);
        Collections.reverse(list);

        for (Integer integer : list) {
            answer += String.valueOf(integer);
        }

        answer = String.valueOf(Integer.parseInt(answer));

        return answer;
    }
}

// 6~ 15
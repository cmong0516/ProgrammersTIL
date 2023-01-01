import java.util.ArrayList;
import java.util.List;

public class CutAndStoringArray {
    public static void main(String[] args) {
        solution("abcdef123"	, 3);
    }

    public static String[] solution(String my_str, int n) {

        List<String> list = new ArrayList<>();
        
        String[] split = my_str.split("");

        String temp = "";
        for (int i = 1; i <= split.length; i++) {
            temp+=split[i-1];
            if (i%n == 0) {
                list.add(temp);
                temp = "";
            }
            if (i == split.length && !temp.equals("")) {
                list.add(temp);
            }
        }

        System.out.println("list = " + list);

        return list.toArray(new String[list.size()]);
    }
}


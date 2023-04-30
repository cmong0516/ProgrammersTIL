import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class NewsClustering {
    public static void main(String[] args) {
        solution("E=M*C^2","e=m*c^2");
    }

    public static int solution(String str1, String str2) {
        List<String> list1 = makeStrList(str1);
        List<String> list2 = makeStrList(str2);

        List<String> removeStr1 = removeSpecialCharacters(list1);
        List<String> removeStr2 = removeSpecialCharacters(list2);

        return count(removeStr1, removeStr2);
    }

    public static List<String> makeStrList(String str) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < str.length()-1; i++) {
            String substring = str.substring(i, i + 2);
            result.add(substring);
        }

        System.out.println("makeStrresult = " + result);

        return result;
    }

    public static List<String> removeSpecialCharacters(List<String> strList) {
        String pattern = "[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]";

        List<String> result = new ArrayList<>();

        for (String s : strList) {
            String[] split = s.split("");

            if (!Pattern.matches(pattern, split[0]) && !Pattern.matches(pattern, split[1]) && !split[0].equals(" ") && !split[1].equals(" ")) {
                result.add(s.toLowerCase());
            }
        }

        System.out.println("removeSpecialresult = " + result);

        return result;
    }

    public static int count(List<String> list1, List<String> list2) {

        Set<String> set = new HashSet<>(list1);

        set.addAll(list2);

        System.out.println("set = " + set);

        double union = set.size();

        list1.retainAll(list2);

        System.out.println("list1 = " + list1);

        double intersection = list1.size();

        System.out.println("union = " + union);
        System.out.println("intersection = " + intersection);

        System.out.println("intersection/union) * 65536 = " + (intersection / union) * 65536.00);

        return (int)((Math.floor((intersection/union) * 65536)));
    }
}

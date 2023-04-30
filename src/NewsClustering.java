import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class NewsClustering {
    public static void main(String[] args) {
        solution("aa1+aa2","AAAA12");
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
        Pattern num = Pattern.compile("^[0-9]+$");

        List<String> result = new ArrayList<>();

        for (String s : strList) {
            String[] split = s.split("");

            if (!Pattern.matches(pattern, split[0]) && !Pattern.matches(pattern, split[1]) && !split[0].equals(" ") && !split[1].equals(" ") && !num.matcher(split[0]).matches()&& !num.matcher(split[1]).matches()) {
                result.add(s.toLowerCase());
            }
        }

        System.out.println("removeSpecialresult = " + result);

        return result;
    }

    public static int count(List<String> list1, List<String> list2) {
        
        double uinion = 0;
        double intersection = 0;

        Map<String, Integer> list1Map = new HashMap<>();
        Map<String, Integer> list2Map = new HashMap<>();
        Set<String> allKeySet = new HashSet<>();

        for (String s : list1) {
            list1Map.put(s, list1Map.getOrDefault(s, 0) + 1);
            allKeySet.add(s);
        }

        for (String s : list2) {
            list2Map.put(s, list2Map.getOrDefault(s, 0) + 1);
            allKeySet.add(s);
        }

        System.out.println("list1Map = " + list1Map);
        System.out.println("list2Map = " + list2Map);
        System.out.println("allKeySet = " + allKeySet);

        for (String s : allKeySet) {
            intersection += Math.min(list1Map.getOrDefault(s, 0), list2Map.getOrDefault(s, 0));
            uinion += Math.max(list1Map.getOrDefault(s, 0), list2Map.getOrDefault(s, 0));
        }

        System.out.println("uinion = " + uinion);
        System.out.println("intersection = " + intersection);

        if (uinion == 0 || intersection == 0) {
            return 65536;
        }

        double answer = intersection / uinion;

        
        return (int) (answer * 65536);
    }
}

// 3 5 8 9 10
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrivacyCollectionValidityPeriod {
    public static void main(String[] args) throws ParseException {
        solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
    }

    public static int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        List<Integer> answer = new ArrayList<>();

        Map<String, String> termsMap = makeTermsMap(terms);

        System.out.println("termsMap = " + termsMap);

        for (int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            String[] split = privacy.split("\\.");

            boolean over = isOver(today, privacy,termsMap);

            if (over) {
                answer.add(i+1);
            }

        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    static boolean isOver(String today, String privacy,Map<String, String> termsMap) throws ParseException {
        String[] split = privacy.split("\\.");

        today = today.replace(".", "");
        String replace = privacy.substring(0, 10).replace(".", "");
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
        Date todayDt = dtFormat.parse(today);
        Date privacyDt = dtFormat.parse(replace);

        cal.setTime(privacyDt);

        String term = termsMap.get(split[2].substring(3));

        cal.add(Calendar.MONTH,Integer.parseInt(term));


        if (Integer.parseInt(dtFormat.format(cal.getTime())) <= Integer.parseInt(today)) {
            return true;
        }

        System.out.println("Integer.parseInt(dtFormat.format(cal.getTime())) = " + Integer.parseInt(
                dtFormat.format(cal.getTime())));

        System.out.println("Integer.parseInt(today) = " + Integer.parseInt(today));

        return false;
    }

    static Map<String, String> makeTermsMap(String[] terms) {
        Map<String, String> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] split = term.split(" ");
            termsMap.put(split[0], split[1]);
        }

        return termsMap;
    }

}


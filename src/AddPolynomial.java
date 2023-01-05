import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class AddPolynomial {
    public static void main(String[] args) {
        solution("x + 7 + 3");
    }

    public static String solution(String polynomial) {
        Pattern pattern = Pattern.compile("^[0-9]+$");

        String answer = "";
        List<String> list = new ArrayList<>();


        String[] s = polynomial.split(" ");
        int temp = 0;
        int temp2 = 0;
        for (String s1 : s) {
            if (pattern.matcher(s1).matches()) {
                temp2+= Integer.parseInt(s1);
            }
            if (s1.contains("x")) {
                String x = s1.replace("x", "");

                if (x.equals("")) {
                    temp += 1;
                }
                if (!x.equals("")) {
                    temp +=Integer.parseInt(x);
                }


            }
        }
        if (temp == 1) {
            list.add(0,"x");
        }

        if (temp > 1) {
            list.add(0,temp + "x");    
        }

        if (temp2 != 0) {
            list.add(String.valueOf(temp2));
        }


        for (int i = 0; i < list.size(); i++) {
            answer+=list.get(i);

            if (i != list.size() - 1) {
                answer += " + ";
            }
        }

        return answer;
    }
}

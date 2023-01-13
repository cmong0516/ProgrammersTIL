import java.util.regex.Pattern;

public class Babbling2 {
    public static void main(String[] args) {
        solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});
    }

    public static int solution(String[] babbling) {
        Pattern pt = Pattern.compile("^[0-9]+$");

        int answer = babbling.length;

        String[] can = new String[]{"aya", "ye", "woo", "ma"};

        for (String s : babbling) {
            String s1 = s.replaceAll(can[0], "0").replaceAll(can[1], "1").replaceAll(can[2], "2")
                    .replaceAll(can[3], "3");

            System.out.println("s1 = " + s1);

            String[] split = s1.split("");

            for (String sp : split) {

                if (s1.contains("00") || s1.contains("11") || s1.contains("22") || s1.contains("33") || !pt.matcher(sp).matches()) {
                    answer--;
                    break;
                }
            }

        }

        System.out.println("answer = " + answer);

        return answer;
    }

}

// 1 11 14 16 17
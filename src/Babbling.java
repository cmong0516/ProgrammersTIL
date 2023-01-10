
public class Babbling {
    public static void main(String[] args) {
        solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
    }
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] can = {"aya", "ye", "woo", "ma"};

        for (String s : babbling) {
            for (String c : can) {
                s = s.replaceFirst(c, " ");
            }
            if (s.replaceAll(" ", "").equals("")) {
                answer++;
            }
        }

        return answer;
    }
}


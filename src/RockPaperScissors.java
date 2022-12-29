public class RockPaperScissors {
    public static void main(String[] args) {
        solution("2");
    }

    public static String solution(String rsp) {
        String answer = "";

        String[] split = rsp.split("");
        for (String s : split) {
            if (s.equals("2")) {
                answer+= "0";
            }
            if (s.equals("0")) {
                answer+= "5";
            }
            if (s.equals("5")) {
                answer+= "2";
            }
        }

        return answer;
    }
}

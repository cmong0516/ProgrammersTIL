public class StringReverse {
    public static void main(String[] args) {
        solution("jaron");
    }

    public static String solution(String my_string) {
        String answer = "";

        String[] split = my_string.split("");

        for (int i = 0; i < split.length; i++) {
            answer += split[split.length-1-i];
        }

        return answer;
    }
}


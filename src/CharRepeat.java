public class CharRepeat {
    public static void main(String[] args) {
        solution("hello",3);
    }

    public static String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] split = my_string.split("");

        for (String s : split) {
            sb.append(s.repeat(n));
        }

        answer = String.valueOf(sb);
        return answer;
    }
}

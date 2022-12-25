public class RemoveAIndex {
    public static void main(String[] args) {
        solution("abcdef","f");
    }

    public static String solution(String my_string, String letter) {
        String answer = "";

        String[] split = my_string.split("");

        for (String s : split) {
            if (!s.equals(letter)) {
                answer += s;
            }
        }

        System.out.println("answer = " + answer);
        return answer;
    }
}

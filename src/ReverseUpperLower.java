

public class ReverseUpperLower {
    public static void main(String[] args) {
        solution("abCdEfghIJ");
    }

    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        char[] chars = my_string.toCharArray();

        for (char aChar : chars) {
            if (aChar > 96) {
                answer.append(String.valueOf(aChar).toUpperCase());
            }
            if (aChar > 64 && aChar < 97) {
                answer.append(String.valueOf(aChar).toLowerCase());
            }
        }
        return answer.toString();
    }
}

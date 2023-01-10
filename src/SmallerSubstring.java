public class SmallerSubstring {
    public static void main(String[] args) {
        solution("3141592", "271");
    }

    public static int solution(String t, String p) {
        int answer = 0;

        int length = p.length();

        for (int i = 0; i < t.length(); i++) {
            if (i + length == t.length()+1) {
                break;
            }
            String substring = t.substring(i, i + length);

            if (Long.parseLong(substring) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }
}

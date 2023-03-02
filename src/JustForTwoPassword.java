import java.util.ArrayList;
import java.util.List;

public class JustForTwoPassword {
    public static void main(String[] args) {
        solution("aukks","wbqd",5);
    }

    static String solution(String s,String skip,int index) {
        String answer = "";

        char[] arr = new char[26];

        char[] chars = s.toCharArray();

        char[] skipChars = skip.toCharArray();

        List<Character> charList = new ArrayList<>();

        for (char skipChar : skipChars) {
            charList.add(skipChar);
        }

        arr[0] = 'a';

        for (int i = 1; i < 26; i++) {
            arr[i] = (char) (arr[i-1]+1);
        }

        for (char c : chars) {
            for (int i = 0; i < index; i++) {
                c = (char)(c +1);
                if (c == 'z' + 1) {
                    c = 'a';
                }
                if (charList.contains(c)) {
                    c = (char)(c+1);
                }
                if (c == 'z' + 1) {
                    c = 'a';
                }
            }
            answer += String.valueOf(c);

        }

        return answer;

    }
}

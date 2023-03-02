import java.util.ArrayList;
import java.util.List;

public class JustForTwoPassword {
    public static void main(String[] args) {
        solution("z","abcdefghij",20);
    }

    static String solution(String s,String skip,int index) {
        String answer = "";

        char[] arr = new char[26];
        char[] chars = s.toCharArray();
        char[] skipChars = skip.toCharArray();

        List<Character> skipList = new ArrayList<>();

        for (char skipChar : skipChars) {
            skipList.add(skipChar);
        }

        arr[0] = 'a';

        for (int i = 1; i < 26; i++) {
            arr[i] = (char) (arr[i-1]+1);
        }

        for (char aChar : chars) {

            for (int i = 0; i < index; i++) {
                aChar = (char)(aChar+1);

                if (aChar > 'z') {
                    aChar -= 26;
                }

                if (skipList.contains(aChar)) {
                    i--;
                }
            }

            answer += String.valueOf(aChar);
        }

        return answer;

    }
}

// a b c d e f g h i j
// a -> b c d e f
// a -> c e f g h
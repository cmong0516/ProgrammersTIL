import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PushString {
    public static void main(String[] args) {
        solution("apple"	, "ohell");
    }

    public static int solution(String A, String B) {
        int answer = 0;

        while (!isSame(A, B)) {
            B = pushString(B);
            answer++;
            if (answer > A.length()) {
                return -1;
            }
        }


        return answer;
    }

    public static boolean isSame(String A, String B) {
        String[] splitA = A.split("");
        String[] splitB = B.split("");

        for (int i = 0; i < splitA.length; i++) {
            if (!splitA[i].equals(splitB[i])) {
                return false;
            }
        }
        return true;
    }

    public static String pushString(String B) {
        String result = "";
        String[] split = B.split("");
        List<String> list = new ArrayList<>();

        Collections.addAll(list, split);

        String remove = list.remove(0);

        list.add(remove);

        for (String s : list) {
            result+=s;
        }

        return result;
    }
}


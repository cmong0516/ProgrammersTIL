public class ContainString {
    public static void main(String[] args) {
        solution("ab6CDE443fgh22iJKlmn1o","6CD"	);
    }

    public static int solution(String str1, String str2) {
        int answer = 2;

        if (str1.contains(str2)) {
            answer = 1;
        }

        return answer;
    }
}


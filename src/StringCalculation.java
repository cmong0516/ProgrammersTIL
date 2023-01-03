public class StringCalculation {
    public static void main(String[] args) {
        solution("30 + 40 + 10");
    }

    public static int solution(String my_string) {
        String[] s = my_string.split(" ");

        int answer = Integer.parseInt(s[0]);


        for (int i = 1; i < s.length; i++) {
            if (s[i].equals("+")) {
                answer += Integer.parseInt(s[i+1]);
            }

            if (s[i].equals("-")) {
                answer -= Integer.parseInt(s[i+1]);
            }
        }

        return answer;
    }
}


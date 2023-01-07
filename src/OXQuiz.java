public class OXQuiz {
    public static void main(String[] args) {
        solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"});
    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String s = quiz[i];
            String[] s1 = s.split(" ");
            int intA = Integer.parseInt(s1[0]);
            int intB = Integer.parseInt(s1[2]);
            int result = Integer.parseInt(s1[4]);

            if (s1[1].equals("+")) {
                if (intA + intB == result) {
                    answer[i] = "O";
                }
                if (intA + intB != result) {
                    answer[i] = "X";
                }
            }

            if (s1[1].equals("-")) {
                if (intA - intB == result) {
                    answer[i] = "O";
                }
                if (intA - intB != result) {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}

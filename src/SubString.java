public class SubString {
    public static void main(String[] args) {
        solution("aaabbaccccabba");
    }

    public static int solution(String s) {
        int answer = 0;


        while (s.length() != 0) {
            answer++;

            char x = s.charAt(0);
            int equalCnt = 1;
            int notEqualCnt = 0;
            for (int i = 1; i < s.length(); i++) {

                if (s.charAt(i) == x) {
                    equalCnt++;
                }
                if (s.charAt(i) != x) {
                    notEqualCnt++;
                }

                if (equalCnt == notEqualCnt) {
                    break;
                }

            }
            s = s.substring(equalCnt+notEqualCnt);
        }


        System.out.println("answer = " + answer);


        return answer;
    }
}

// 4 5 7 32 33
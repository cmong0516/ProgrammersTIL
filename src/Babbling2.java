public class Babbling2 {
    public static void main(String[] args) {
        solution(new String[]{"woayao"});
    }

    public static int solution(String[] babbling) {
        int answer = 0;

        String[] can = new String[]{"aya", "ye", "woo", "ma"};
        int a = 0;
        for (String s : babbling) {
            for (String s1 : can) {
                s = s.replaceFirst(s1,"1");
                System.out.println("s = " + s);
                if (s.startsWith(s1)) {
                    break;
                }
            }

            if (s.replaceAll("1","").equals("")) {
                answer++;
            }
            System.out.println();

        }

        System.out.println("answer = " + answer);

        return answer;
    }
}

// 1 11 14 16 17
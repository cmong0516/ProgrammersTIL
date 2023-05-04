public class BinaryNGame {
    public static void main(String[] args) {
        solution(16, 16, 2, 2);
    }

    public static String solution(int n, int t, int m, int p) {
        String answer = "";

        String s = toBinary(n,t*p);

        System.out.println("s = " + s);

        for (int i = p-1; i < t*m; i+=m) {
            answer += s.charAt(i);
        }

        System.out.println("answer = " + answer);

        return answer.toUpperCase();
    }

    public static String toBinary(int n,int m) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <m; i++) {
            sb.append(Integer.toString(i, n));
        }

        return String.valueOf(sb);
    }
}
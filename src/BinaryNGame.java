public class BinaryNGame {
    public static void main(String[] args) {
        solution(2, 4, 2, 1);
    }

    public static String solution(int n, int t, int m, int p) {
        String answer = "";

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 100; i++) {
            sb.append(Integer.toBinaryString(i));
        }

        System.out.println("sb = " + sb);

        for (int i = 4; i < sb.length(); i+=2) {
            System.out.println("sb.charAt(i) = " + sb.charAt(i));
        }

        return answer;
    }
}
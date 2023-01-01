public class PlusBinary {
    public static void main(String[] args) {
        solution("10", "11");
    }

    public static String solution(String bin1, String bin2) {
        int i = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);

        return Integer.toBinaryString(i);
    }
}

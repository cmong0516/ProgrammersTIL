public class Decryption {
    public static void main(String[] args) {
        solution("dfjardstddetckdaccccdegk", 4);
    }

    public static String solution(String cipher, int code) {
        String answer = "";
        String[] split = cipher.split("");
        for (int i = code-1; i < split.length; i+=code) {
            answer+=split[i];
        }

        return answer;
    }
}

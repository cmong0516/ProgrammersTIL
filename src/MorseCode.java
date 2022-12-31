public class MorseCode {
    public static void main(String[] args) {
        solution(".... . .-.. .-.. ---");
    }

    public static String solution(String letter) {
        String answer = "";

        String[] list = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] split = letter.split(" ");

        for (String s : split) {
            for (int i = 0; i < list.length; i++) {
                if (s.equals(list[i])) {
                    answer += String.valueOf((char)(i+97));
                }
            }
        }

        return answer;
    }
}

import java.util.Arrays;

public class VowelDictionary {
    public static void main(String[] args) {
        solution("I");
    }

    public static int solution(String word) {
        int answer = 0;

        String dic = "AEIOU";

        // A AA AAA AAAA AAAAA AAAAE AAAAI AAAAO AAAAU

        int total = findTotal(dic);

        for (int i = 0; i < word.length(); i++) {
            total /= 5 ;
            answer += total * dic.indexOf(word.charAt(i)) +1;
        }

        return answer;
    }

    public static int findTotal(String dic) {
        int result = 0;

        for (int i = 1; i <= dic.length(); i++) {
            result += Math.pow(5,i);
        }

        return result;
    }
}

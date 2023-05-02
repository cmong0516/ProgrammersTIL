import java.util.ArrayList;
import java.util.List;

public class Compression {
    public static void main(String[] args) {
        solution("KAKAO");
    }

    public static int[] solution(String msg) {
        int[] answer = {};

        List<String> aToZList = makeAToZList();

        System.out.println("aToZList = " + aToZList);

        // k ka kak kaka kakao

        for (int i = 0; i < msg.length(); i++) {
            for (int j = i; j < msg.length() + 1; j++) {

                if (!aToZList.contains(msg.substring(i, j))) {
                    aToZList.add(msg.substring(i, j));
                    j++;
                }
                System.out.println("aToZList = " + aToZList);
            }
        }

        return answer;
    }

    public static List<String> makeAToZList() {
        List<String> characterList = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            characterList.add(String.valueOf((char) ('A' + i)));
        }

        return characterList;
    }
}

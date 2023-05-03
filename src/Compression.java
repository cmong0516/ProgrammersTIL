import java.util.ArrayList;
import java.util.List;

public class Compression {
    public static void main(String[] args) {
        solution("KAKAO");
    }

    public static int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();

        List<String> aToZList = makeAToZList();

        // k ka kak kaka kakao

        for (int i = 0; i < msg.length(); i++) {
            for (int j = aToZList.size()-1; j >= 0; j--) {
                if (msg.substring(i).startsWith(aToZList.get(j))) {
                    i+= aToZList.get(j).length()-1;
                    answer.add(j+1);

                    if (i + 1 < msg.length()) {
                        aToZList.add(aToZList.get(j) + msg.charAt(i + 1));
                    }
                    break;
                }
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static List<String> makeAToZList() {
        List<String> characterList = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            characterList.add(String.valueOf((char) ('A' + i)));
        }

        return characterList;
    }
}

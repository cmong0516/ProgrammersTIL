import java.util.List;
import java.util.ArrayList;

public class CursedNumberThree {
    public static void main(String[] args) {
        solution(40);
    }

    public static int solution(int n) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && !String.valueOf(i).contains("3")) {
                list.add(i);
            }
        }

        answer = list.get(n-1);

        return answer;
    }
}


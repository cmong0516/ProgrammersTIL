public class AntCorps {
    public static void main(String[] args) {
        solution(24);
    }

    public static int solution(int hp) {
        int answer = 0;

        answer += hp/5;

        hp = hp - 5*(hp/5);

        answer += hp/3;

        hp = hp - 3*(hp/3);

        answer += hp/1;

        return answer;
    }
}


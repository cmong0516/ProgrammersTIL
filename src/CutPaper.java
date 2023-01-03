public class CutPaper {
    public static void main(String[] args) {
        solution(2, 2);
    }

    public static int solution(int M, int N) {
        int answer = 0;

        answer = M*N-1;

        if (answer < 0) {
            answer = 0;
        }

        return answer;
    }
}

public class EvenOddCount {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 5});
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for (int i : num_list) {
            if (i % 2 == 0) {
                answer[0]++;
            }
            if (i % 2 == 1) {
                answer[1]++;
            }
        }

        return answer;
    }
}

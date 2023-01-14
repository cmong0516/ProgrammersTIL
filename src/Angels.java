public class Angels {
    public static void main(String[] args) {
        solution(new int[]{-2, 3, 0, 2, -5});
    }

    public static int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                for (int k = j+1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }

        }

        System.out.println("answer = " + answer);

        return answer;
    }
}

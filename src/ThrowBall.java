public class ThrowBall {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3}, 2);
    }

    public static int solution(int[] numbers, int k) {

        return numbers[2*(k-1)%numbers.length];
    }
}

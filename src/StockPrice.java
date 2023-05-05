import java.util.Arrays;

public class StockPrice {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 2, 3});
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            System.out.println("prices[i] = " + prices[i]);
            System.out.println();
            int k = 0;
            for (int j = i+1; j < prices.length; j++) {
                System.out.println("prices[j] = " + prices[j]);
                if (prices[i] > prices[j]) {
                    k++;
                    break;
                } else {
                    k++;
                }
            }

            answer[i] = k;
        }

        System.out.println("answer = " + Arrays.toString(answer));

        return answer;
    }
}
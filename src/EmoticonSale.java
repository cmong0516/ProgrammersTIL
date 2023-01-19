import java.util.Arrays;

public class EmoticonSale {
    public static void main(String[] args) {
        int[][] a = {{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}};
        solution(a, new int[]{1300, 1500, 1600, 4900});
    }

    public static int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];

        int[] discount = new int[]{40, 30, 20, 10};
        int member = 0;

        // 이모티콘 가격 1300 1500 1600 4900
        // total = 1300 * a + 1500 * b + 1600 * c + 4900 *d
        // a b c d >= users[0][0] 구매
        // total >= users[0][1] 가입
        // total < users[0][1] 미가입

        return answer;
    }
}

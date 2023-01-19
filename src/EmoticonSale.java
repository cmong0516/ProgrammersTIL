import java.util.Arrays;

public class EmoticonSale {
    static int sign = 0;
    static int earn = 0;

    public static void main(String[] args) {

        int[][] a = {{40,10000},{25,10000}};
        solution(a, new int[]{7000,9000});
    }

    public static int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];

        // 이모티콘 가격 1300 1500 1600 4900
        // total = 1300 * a + 1500 * b + 1600 * c + 4900 *d
        // a b c d >= users[0][0] 구매
        // total >= users[0][1] 가입
        // total < users[0][1] 미가입
        // int emoticonPrice = ((100 - i) * emoticon) / 100;

        int[] arr = new int[emoticons.length];

        comb(arr,0,users,emoticons);

        answer[0] = sign;
        answer[1] = earn;

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));

        return answer;
    }

    static void comb(int[] arr, int start, int[][] users, int[] emoticons) {
        if (start == arr.length) {
            calculate(arr,users,emoticons);
            return;
        }

        for (int i = 10; i <= 40; i += 10) {
            arr[start] = i;
            comb(arr, start+1, users, emoticons);
        }
    }

    static void calculate(int[] arr,int[][] users, int[] emoticons) {
        int count = 0;
        int earnTotal = 0;

        for (int[] user : users) {
            int discountPercent = user[0];
            int joinPrice = user[1];
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= discountPercent) {
                    sum += ((100 - arr[i]) * (emoticons[i]) / 100);
                }
            }
            if (sum >= joinPrice) {
                count++;
            }

            if (sum < joinPrice) {
                earnTotal += sum;
            }
        }

        if (count > sign) {
            sign = count;
            earn = earnTotal;
            return;
        }

        if (count == sign) {
            if (earn < earnTotal) {
                earn = earnTotal;
            }
        }
    }
}

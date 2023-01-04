public class ChickenCoupon {
    public static void main(String[] args) {
        solution(100);
    }

    public static int solution(int chicken) {
        int answer = 0;

        int coupon = chicken;

        while (true) {
            // 치킨 1081마리 쿠폰 1081개 108
            // 치킨 108마리 쿠폰 109개 10
            // 치킨 10마리 쿠폰 19개 1
            // 치킨 1마리 쿠폰 10개 1
//            System.out.println("쿠폰수 = " + coupon);
            answer+= coupon/10;
            coupon = coupon/10 + coupon%10;
            if (coupon < 10) {
                break;
            }

//            System.out.println("answer = " + answer);
        }

        return answer;
    }
}


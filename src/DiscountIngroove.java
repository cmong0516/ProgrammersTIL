public class DiscountIngroove {
    public static void main(String[] args) {
        solution(150000);
    }

    public static int solution(int price) {
        if (price >= 100000 && price < 300000) {
            return (int) (price * 0.95);
        }
        if (price >= 300000 && price < 500000) {
            return (int) (price * 0.90);
        }
        if (price >= 500000) {
            return (int) (price * 0.8);
        }

        return price;
    }
}


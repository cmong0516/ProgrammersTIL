public class FindDecimalsFromK {
    public static void main(String[] args) {
        solution(110011, 10);
    }

    public static int solution(int n, int k) {
        int answer = 0;

        String s = toBinary(n, k);

        s = removeZero(s);

        String[] split = s.split("0");

        for (String s1 : split) {
            if (isPrime(Long.parseLong(s1))) {
                answer++;
            }
        }

        return answer;
    }

    public static String toBinary(int n,int k) {
        StringBuffer sb = new StringBuffer();

        int current = n;

        while (current > 0) {
            if (current % k < 10) {
                sb.append(current % k);
            } else {
                sb.append(current % k - 10 + 'A');
            }

            current /= k;
        }

        return sb.reverse().toString();
    }

    public static boolean isPrime(long n) {

        if (n == 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }


        return true;
    }

    public static String removeZero(String s) {

        while (s.contains("00")) {
            s = s.replaceAll("00", "0");
        }

        return s;
    }
}
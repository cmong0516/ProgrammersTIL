import java.util.ArrayList;
import java.util.List;

public class DetermineFinitePrimeNumbers {
    public static void main(String[] args) {
        solution(12, 36);
    }

    public static int solution(int a, int b) {
        List<Integer> pA = primeFactorization(a);
        List<Integer> pB = primeFactorization(b);

        List<Integer> removeA = removeNotTwoFive(pA);
        List<Integer> removeB = removeNotTwoFive(pB);

        int answer = determine(removeA, removeB);

        return answer;
    }

    public static List<Integer> primeFactorization(int b) {
        List<Integer> list = new ArrayList<>();
        int i = 2;
        int tempb = b;
        while (i <= tempb) {
            if (b % i == 0) {
                list.add(i);
                b = b / i;
                i--;
            }
            i++;
        }

        System.out.println("list = " + list);
        return list;
    }

    public static List<Integer> removeNotTwoFive(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        for (Integer integer : list) {
            if (integer != 2 && integer != 5) {
                result.add(integer);
            }
        }

        System.out.println("result = " + result);

        return result;
    }

    public static int determine(List<Integer> a, List<Integer> b) {
        int a1 = 1;
        int b1 = 1;
        for (Integer integer : a) {
            a1 *= integer;
        }

        for (Integer integer : b) {
            b1 *= integer;
        }

        if (a1 % b1 != 0) {
            return 2;
        }

        return 1;
    }

}


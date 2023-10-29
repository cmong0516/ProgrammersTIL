import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class FindPrimeNumber {

    static Set<Integer> set = new HashSet<>();
    static char[] arr;
    static boolean[] visit;

    public static void main(String[] args) {
        solution("011");
    }

    public static int solution(String numbers) {
        arr = new char[numbers.length()];
        visit = new boolean[numbers.length()];

        for (int i = 0; i < numbers.length(); i++) {
            arr[i] = numbers.charAt(i);
        }

        dfs("",0);

        System.out.println("set = " + set);

        return set.size();
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void dfs(String str, int index) {

        System.out.println("str = " + str);
        System.out.println("index = " + index);
        System.out.println();
        
        int num;

        if (!Objects.equals(str, "")) {
            num = Integer.parseInt(str);
            if (isPrime(num)) {
                set.add(num);
            }
        }

        if (index == arr.length) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (visit[i]) {
                continue;
            }
            visit[i] = true;
            dfs(str+arr[i], index+1);
            visit[i] = false;
        }
    }


}

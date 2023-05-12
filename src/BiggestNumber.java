import java.util.Arrays;
import java.util.Comparator;

public class BiggestNumber {
    public static void main(String[] args) {
        solution(new int[]{0,0,0,0,0,0,0});
    }

    public static String solution(int[] numbers) {
        String answer = "";

        Integer[] intArr = new Integer[numbers.length];
        for(int i=0; i<numbers.length; i++) {
            intArr[i] = numbers[i];
        }


        Arrays.sort(intArr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1, o2를 문자열로 변환하여 두 문자열의 조합 중 큰 값을 선택
                String s1 = o1.toString();
                String s2 = o2.toString();
                String s1s2 = s1 + s2;
                String s2s1 = s2 + s1;
                return s2s1.compareTo(s1s2); // 내림차순으로 정렬
            }
        });

        System.out.println("intArr = " + Arrays.toString(intArr));

        for (Integer integer : intArr) {
            answer += String.valueOf(integer);
        }

        if (answer.startsWith("0")) {
            return "0";
        }

        return answer;
    }
}

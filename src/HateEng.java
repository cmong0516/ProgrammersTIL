public class HateEng {
    public static void main(String[] args) {
        solution("onetwothreefourfivesixseveneightnine");
    }

    public static long solution(String numbers) {
        long answer = 0;

        String[] list = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < list.length; i++) {
            numbers = numbers.replace(list[i],String.valueOf(i));
        }



        return Long.parseLong(numbers);
    }
}


public class UnderTwoAnotherBeat {
    public static void main(String[] args) {
        solution(new long[]{2, 7});
    }

    public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;
            } else {
                String binaryString = Long.toString(numbers[i], 2);
                int zeroIndex = binaryString.lastIndexOf("0");

                if (zeroIndex != -1) {
                    binaryString = binaryString.substring(0, zeroIndex) + "10" + binaryString.substring(zeroIndex + 2,
                            binaryString.length());
                    answer[i] = Long.parseLong(binaryString, 2);
                } else {
                    binaryString = "10" + binaryString.substring(1, binaryString.length());
                    answer[i] = Long.parseLong(binaryString, 2);
                }
            }
        }

        return answer;
    }
}

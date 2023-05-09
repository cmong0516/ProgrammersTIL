import java.util.Arrays;
import java.util.Comparator;

public class FileNameSort {
    public static void main(String[] args) {
        solution(new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"});
    }

    public static String[] solution(String[] files) {
        String[] answer = {};
        int[] startNumIndexArr = new int[files.length];
        int[] lastNumIndexArr = new int[files.length];
        int[] numberArr = new int[files.length];

        System.out.println("files = " + Arrays.toString(files));

        int j = 0;

        for (String file : files) {
            int startNumIndex = -1;
            int lastNumIndex = 0;
            for (int i = 0; i < file.length(); i++) {
                if (Character.isDigit(file.charAt(i)) && startNumIndex == -1) {
                    startNumIndex = i;
                    lastNumIndex = i-1;
                }
                if (Character.isDigit(file.charAt(i)) && startNumIndex != -1) {
                    lastNumIndex++;
                }
                if (!Character.isDigit(file.charAt(i)) && startNumIndex != -1) {
                    break;
                }
            }
            startNumIndexArr[j] = startNumIndex;
            lastNumIndexArr[j] = lastNumIndex;
            j++;
        }

        System.out.println("startNumIndexArr = " + Arrays.toString(startNumIndexArr));
        System.out.println("lastNumIndexArr = " + Arrays.toString(lastNumIndexArr));

        System.out.println("files = " + Arrays.toString(files));

        for (int i = 0; i < files.length; i++) {
            if (startNumIndexArr[i] == lastNumIndexArr[i]) {
                numberArr[i] = Integer.parseInt(String.valueOf(files[i].charAt(startNumIndexArr[i])));
            } else {
                numberArr[i] = Integer.parseInt(files[i].substring(
                        startNumIndexArr[i], lastNumIndexArr[i]+1));
            }
        }

        System.out.println("numberArr = " + Arrays.toString(numberArr));

        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }

        });

        return answer;
    }

}

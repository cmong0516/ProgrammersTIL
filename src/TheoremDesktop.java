

public class TheoremDesktop {

    static char[][] arr;

    public static void main(String[] args) {
        solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."});
    }

    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        int mini = Integer.MAX_VALUE;
        int minj = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int maxj = Integer.MIN_VALUE;

        arr = new char[wallpaper.length][wallpaper[0].length()];

        for (int i = 0; i < wallpaper.length; i++) {
            arr[i] = wallpaper[i].toCharArray();
        }

//        for (char[] chars : arr) {
//            System.out.println("chars = " + Arrays.toString(chars));
//        }

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[0].length(); j++) {
                if (arr[i][j] == '#') {
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    System.out.println();

                    // 0 1
                    // 1 2
                    // 2 3

                    // 가장 작은 j, 가장 작은 i, 가장큰 i+1 , 가장큰 j+1

                    if (minj > j) {
                        minj = j;
                    }
                    if (mini > i) {
                        mini = i;
                    }
                    if (maxi < i) {
                        maxi = i;
                    }
                    if (maxj < j) {
                        maxj = j;
                    }

                }
            }
        }

//        System.out.println("mini = " + mini);
//        System.out.println("minj = " + minj);
//        System.out.println("maxi = " + maxi);
//        System.out.println("maxj = " + maxj);

        answer[0] = mini;
        answer[1] = minj;
        answer[2] = maxi+1;
        answer[3] = maxj+1;

//        System.out.println("answer = " + Arrays.toString(answer));

        return answer;
    }
}

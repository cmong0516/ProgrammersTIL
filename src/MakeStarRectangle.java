import java.util.Scanner;

public class MakeStarRectangle {
    public static void main(String[] args) {
        run(3);
    }

    public static void run(int n) {
        String star = "*";
        for (int i = 1; i <= n; i++) {
            System.out.println(star.repeat(i));
        }
    }
}

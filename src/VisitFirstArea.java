import java.util.Set;
import java.util.HashSet;

public class VisitFirstArea {
    public static void main(String[] args) {
        int u = solution("ULURRDLLU");
        System.out.println(u);
    }

    public static int solution(String dirs) {

        String[] dirsSplit = dirs.split("");
        int[] current = new int[]{0, 0};
        Set<String> set = new HashSet<>();

        for (String s : dirsSplit) {
            StringBuilder sb = new StringBuilder();
            sb.append(current[0]).append(current[1]).append(",");
            switch (s) {
                case "U":
                    if (current[1] < 5) {
                        current[1]++;
                        sb.append(current[0]).append(current[1]);
                    }
                    break;
                case "D":
                    if (current[1] > -5) {
                        current[1]--;
                        sb.append(current[0]).append(current[1]);
                    }
                    break;
                case "L":
                    if (current[0] > -5) {
                        current[0]--;
                        sb.append(current[0]).append(current[1]);
                    }
                    break;
                case "R":
                    if (current[0] < 5) {
                        current[0]++;
                        sb.append(current[0]).append(current[1]);
                    }
                    break;
            }
            System.out.println("sb = " + sb);

            String[] split = sb.toString().split(",");

            if (split.length == 2) {

                String reverse = split[1] + "," + split[0];
                if (!set.contains(reverse)) {
                    set.add(sb.toString());
                }
            }

        }

        System.out.println("set = " + set);

        return set.size();
    }
}

// 1 8 10 13 14 18 19 20

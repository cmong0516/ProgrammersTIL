public class ControlZ {
    public static void main(String[] args) {
        solution("1 2 Z 3");
    }

    public static int solution(String s) {
        int answer = 0;

        String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("Z")) {
                answer+=Integer.parseInt(split[i]);
            }
            if (split[i].equals("Z")) {
                answer-=Integer.parseInt(split[i-1]);
            }


        }

        return answer;
    }
}

public class ExoplanetsAge {
    public static void main(String[] args) {
        solution(23);
    }
    public static String solution(int age) {
        String answer = "";

        String[] list = new String[]{"a","b","c","d","e","f","g","h","i","j"};

        String s = String.valueOf(age);
        String[] split = s.split("");

        for (String s1 : split) {
            answer += list[Integer.parseInt(s1)];
        }

        return answer;
    }
}


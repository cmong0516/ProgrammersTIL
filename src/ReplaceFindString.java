public class ReplaceFindString {
    public static void main(String[] args) {
        solution("ABBAA", "AABB");
    }

    public static int solution(String myString, String pat) {
        int answer = 0;

        String s = myString.replaceAll("A", "C");

        String s1 = s.replaceAll("B", "A").replaceAll("C", "B");

        if (s1.contains(pat)) {
            answer = 1;
        }

        return answer;
    }
}

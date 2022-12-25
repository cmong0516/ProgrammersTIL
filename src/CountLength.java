public class CountLength {
    public static void main(String[] args) {
        solution(new String[]{"We", "are", "the", "world!"});
    }

    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}

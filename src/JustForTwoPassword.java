public class JustForTwoPassword {
    public static void main(String[] args) {
        solution("aukks","wbqd",5);
    }

    static String solution(String s,String skip,int index) {
        char[] arr = new char[26];

        arr[0] = 'a';

        for (int i = 1; i < 25; i++) {
            arr[i] = (char) (arr[i-1]+1);
        }
        return null;
    }
}

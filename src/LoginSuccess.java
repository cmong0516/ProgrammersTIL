public class LoginSuccess {
    public static void main(String[] args) {
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        solution(new String[]{"meosseugi", "1234"},db);
    }

    public static String solution(String[] id_pw, String[][] db) {
        String answer = "fail";

        for (String[] strings : db) {
            if (strings[0].equals(id_pw[0])) {
                if (strings[1].equals(id_pw[1])) {
                    return "login";
                }
                return "wrong pw";
            }
        }

        return answer;
    }
}

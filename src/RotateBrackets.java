import java.util.Stack;

public class RotateBrackets {
    public static void main(String[] args) {
        solution("[](){}");
    }

    public static int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {

            Stack<Character> stack = new Stack<>();
            String str = s.substring(i, s.length()) + s.substring(0, i);

            for (int j = 0; j < str.length(); j++) {
                if (stack.isEmpty()) {
                    stack.push(str.charAt(j));
                } else if (str.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (str.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (str.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(str.charAt(j));
                }
            }

            if (stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}

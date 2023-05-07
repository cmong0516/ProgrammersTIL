public class SkillTree {
    public static void main(String[] args) {
        solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"});
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String skill_tree : skill_trees) {
            StringBuilder sb = new StringBuilder();
            System.out.println("skill_tree = " + skill_tree);
            for (int i = 0; i < skill_tree.length(); i++) {
                if (skill.contains(skill_tree.charAt(i) + "")) {
                    sb.append(skill_tree.charAt(i));
                }
            }
            if (skill.indexOf(sb.toString()) == 0) {
                answer++;
            }
        }

        System.out.println("answer = " + answer);
        return answer;
    }
}

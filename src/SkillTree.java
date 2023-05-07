public class SkillTree {
    public static void main(String[] args) {
        solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"});
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        char[] skillTree = skill.toCharArray();

        for (String skill_tree : skill_trees) {
            boolean check = true;
            for (int i = 0; i < skillTree.length-1; i++) {
                if (skill_tree.indexOf(skillTree[i]) > skill_tree.indexOf(skillTree[i + 1])) {
                    check = false;
                    break;
                }
            }

            if (check == true) {
                answer++;
            }
        }

        return answer;
    }
}

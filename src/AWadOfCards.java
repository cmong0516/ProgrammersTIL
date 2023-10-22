public class AWadOfCards {
    public static void main(String[] args) {
        solution(new String[]{"i", "drink", "water"},
                new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {

        int index1 = 0;
        int index2 = 0;

        for (String currentStr : goal) {

            if (index1 < cards1.length && currentStr.equals(cards1[index1])) {
                index1++;
            } else if (index2 < cards2.length && currentStr.equals(cards2[index2])) {
                index2++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}

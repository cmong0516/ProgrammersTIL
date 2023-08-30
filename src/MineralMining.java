import static java.util.Collections.frequency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MineralMining {
    public static void main(String[] args) {
        solution(new int[]{0,1,1},
                new String[]{"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"});
    }

    public static int solution(int[] picks, String[] minerals) {
        int answer = 0;

        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < minerals.length/5 +1; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < minerals.length / 5 + 1; i++) {
            for (int j = i *5; j < 5 + i * 5; j++) {
                if (j >= minerals.length)break;
                list.get(i).add(minerals[j]);
            }
        }

        if (minerals.length % 5 == 0) {
            list.remove(list.size() - 1);
        }

        int pickax = picks[0] + picks[1] + picks[2];
        if (pickax < list.size()) {
            int countWillRemove = list.size() - pickax;
            for (int i = 0; i < countWillRemove; i++) {
                list.remove(list.size() - 1);
            }
        }

        Collections.sort(list, (l1, l2) -> {
            if (frequency(l2, "diamond") == frequency(l1, "diamond")) {
                if (frequency(l2, "iron") == frequency(l1, "iron")) {
                    return frequency(l2, "stone") - frequency(l1, "stone");
                } else {
                    return frequency(l2, "iron") - frequency(l1, "iron");
                }
            } else {
                return frequency(l2, "diamond") - frequency(l1, "diamond");
            }
        });

        System.out.println("list = " + list);

        for (int i = 0; i < picks[0]; i++) {
            if (list.isEmpty()) break;
            List<String> curL = list.get(0);
            for (int j = 0; j < curL.size(); j++) {
                answer += 1;
            }
            list.remove(0);
        }

        for (int i = 0; i < picks[1]; i++) {
            if (list.isEmpty()) break;
            List<String> curL = list.get(0);
            for (int j = 0; j < curL.size(); j++) {
                if (curL.get(j).equals("diamond")) answer += 5;
                else answer += 1;
            }
            list.remove(0);
        }

        for (int i = 0; i < picks[2]; i++) {
            if (list.isEmpty()) break;
            List<String> curL = list.get(0);
            for (int j = 0; j < curL.size(); j++) {
                if (curL.get(j).equals("diamond")) answer += 25;
                else if (curL.get(j).equals("iron")) answer += 5;
                else answer += 1;
            }
            list.remove(0);
        }

        return answer;
    }
}

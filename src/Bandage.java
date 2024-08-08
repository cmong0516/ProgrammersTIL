public class Bandage {
    public static void main(String[] args) {
        int[][] attacks = {{1,5},{4,1}};
        int solution = solution(new int[]{1, 1, 1}, 20, attacks);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] bandage, int health, int[][] attacks) {
        // 붕대감기
        // t 초 동안 1초마다 x 의 체력을 회복.
        // t초 연속으로 붕대를 감는데 성공하면 y 의 추가체력 회복.
        // 붕대감기중 공격당하면 취소.(공격 당하는 순간 회복도 안됨) , 연속 성공시간 초기화
        // 피격시 체력이 줄어듬 , 체력 0이하시 사망

        int k = 0;
        int currentHealth = health;
        int success = 0;

        for (int i = 1; i < attacks[attacks.length-1][0]+1; i++) {
            if (attacks[k][0] == i) {
                System.out.println("Attack");
                currentHealth -= attacks[k][1];

                if (currentHealth <= 0) {
                    return -1;
                }
                k++;
                success = 0;
            } else {
                System.out.println("NonAttack");
                if (currentHealth < health) {
                    currentHealth += bandage[1];
                    if (currentHealth > health) {
                        currentHealth = health;
                    }
                }
                success++;
                if (success == bandage[0]) {
                    currentHealth += bandage[2];
                    success = 0;

                    if (currentHealth > health) {
                        currentHealth = health;
                    }
                }
            }

        }
        return currentHealth;
    }
}

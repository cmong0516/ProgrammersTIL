public class NQueen {
    static int count;
    static int[] arr;
    public static void main(String[] args) {
        solution(4);
    }

    public static int solution(int n) {
        arr = new int[n];

        nQueen(0,n);
        
        return count;
    }

    static void nQueen(int depth,int n) {
        if (depth == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[depth] = i;
            if (possible(depth)) {
                nQueen(depth+1,n);
            }
        }
    }

    static boolean possible(int col) {

        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            } else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}


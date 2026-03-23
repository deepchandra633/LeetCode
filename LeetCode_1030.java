import java.util.*;
class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] arr = new int[R * C][2];
        int idx = 0;

        // collect all cels
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                arr[idx][0] = r;
                arr[idx][1] = c;
                idx++;
            }
        }
        Arrays.sort(arr, (a, b) -> {
            int distA = Math.abs(a[0] - r0) + Math.abs(a[1] - c0);
            int distB = Math.abs(b[0] - r0) + Math.abs(b[1] - c0);
            return distA - distB;
        });

        return arr;
    }
}
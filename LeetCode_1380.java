import java.util.*;
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
          int m = matrix.length;
        int n = matrix[0].length;
        // Find the minimum element in each row
        int[] minRow = new int[m];
        Arrays.fill(minRow, Integer.MAX_VALUE);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < minRow[i]) {
                    minRow[i] = matrix[i][j];
                }
            }
        }
        // Find the maximum element in each column
        int[] maxCol = new int[n];
        Arrays.fill(maxCol, Integer.MIN_VALUE);
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] > maxCol[j]) {
                    maxCol[j] = matrix[i][j];
                }
            }
        }
         // Find all elements that are min in their row and max in their column
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }
}
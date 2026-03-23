class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rowCount = new int[m];
        int[] colCount = new int[n];
        
        // Count increments for each row and column
        for (int[] index : indices) {
            rowCount[index[0]]++;
            colCount[index[1]]++;
        }
        
        int oddCount = 0;
        
        // Calculate the number of cells with odd values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // The value at cell (i, j) is rowCount[i] + colCount[j]
                if ((rowCount[i] + colCount[j]) % 2 == 1) {
                    oddCount++;
                }
            }
        }
        
        return oddCount;
    }
}
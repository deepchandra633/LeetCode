class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;
        
        for (int chip : position) {
            if (chip % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        // Minimum cost is the smaller count of chips on even or odd positions
        return Math.min(evenCount, oddCount);
    }
}
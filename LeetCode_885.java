class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int count = 0;
        int total = rows * cols;
        
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
         int step = 1;  
        int r = rStart, c = cStart;
        result[count++] = new int[]{r, c};
        
        while (count < total) {
            for (int i = 0; i < 4; i++) {
                int stepsInThisDirection = (i / 2) + step;
                for (int j = 0; j < step; j++) {
                    r += directions[i][0];
                    c += directions[i][1];
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        result[count++] = new int[]{r, c};
                        if (count == total) {
                            return result;
                        }
                    }
                }
                if (i % 2 == 1) {
                    step++;
                }
            }
        }
        
        return result;
    }
}
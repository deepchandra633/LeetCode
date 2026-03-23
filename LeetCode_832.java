class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            int sR = 0;
            int eR = n - 1;
            // swap 
            while (sR <= eR) {
                int temp = image[i][sR] ^ 1;
                image[i][sR] = image[i][eR] ^ 1;
                image[i][eR] = temp;
                sR++;
                eR--;
            }
        }
        return image;
    }
}
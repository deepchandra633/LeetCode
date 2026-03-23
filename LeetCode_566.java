class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c)return mat;
        if(m==r && n==c)return mat;

        int pre_idx=0;
        int curr_idx=0;
        int [][] new_mat=new int [r][c];
        while(pre_idx<r*c && curr_idx<m*n){
            new_mat[pre_idx/c][pre_idx%c]=mat[curr_idx/n][curr_idx%n];
            pre_idx++;
            curr_idx++;
        }
        return new_mat;
    }
}
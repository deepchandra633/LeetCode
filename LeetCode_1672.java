class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for(int r=0;r<accounts.length;r++){
            int rowSum=0;
            for(int c=0;c<accounts[r].length;c++){
               rowSum+=accounts[r][c]; 
            }
            if(rowSum>ans){
                ans=rowSum;
            }
        }
        return ans;
    }
}
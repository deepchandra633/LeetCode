
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int maxprofit = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

            int p = prices[i] - min;
            if (p >= maxprofit) {
                maxprofit = p;
            }
        }
        return maxprofit;
    }

}
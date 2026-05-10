class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int maxProfit = Integer.MIN_VALUE;
        int currProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]){
                currProfit += prices[i] - prices[i - 1];
            }
            maxProfit = Math.max(maxProfit, currProfit);
        }
        return maxProfit;
    }
}
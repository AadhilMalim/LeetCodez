class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxprofit = 0;
        for(int i=0,j=1; i<j && j<len; j++){
            if(prices[j]<prices[i]){
                i=j;
                
            }
            int profit = prices[j]-prices[i];
            if(profit>maxprofit) maxprofit = profit;
        }
        return maxprofit;
    }
}
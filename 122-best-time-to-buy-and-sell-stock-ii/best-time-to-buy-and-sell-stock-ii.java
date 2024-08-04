class Solution {
    public int maxProfit(int[] prices) {

        int len = prices.length;
        int maxprofit = 0;
        int currentprofit =0;
        for(int i=0, j=1; j<len; j++){
            if(prices[j]<prices[j-1]){
                maxprofit+=prices[j-1]-prices[i];
                currentprofit=0;
                i=j;
            }
            else currentprofit = prices[j]-prices[i];
        }
        // int len = prices.length;
        // int maxprofit = 0;
        // int currentprofit =0;
        // for(int i=0, j=0; j<len; j++){
        //     if(prices[j]<prices[i]) i=j;
        //     int profit = prices[j] - prices[i];
        //     if(profit>currentprofit){
        //         currentprofit = profit;
        //     }else if(profit<currentprofit){
        //         maxprofit += currentprofit;
        //         i=j;
        //         currentprofit =0;
        //     }
        // }if(currentprofit>maxprofit) return currentprofit;
        return maxprofit+currentprofit;
    }
}
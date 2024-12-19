class Solution {
    public int[] finalPrices(int[] prices) {
        int[] discount = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            int small =0;
            for(int j=i+1; j<prices.length; j++){
                if(prices[j]<=prices[i]){ small = prices[j]; break;}
            }
            discount[i] = prices[i]-small;
        }
        return discount;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int buyingPrice = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]> buyingPrice){
                maxProfit = Math.max(maxProfit, prices[i]-buyingPrice);
            }else{
                buyingPrice = prices[i];    
            }
            
        }
        return maxProfit;
    }
}
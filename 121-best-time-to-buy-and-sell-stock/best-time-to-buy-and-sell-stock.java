class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min_price = prices[0];
        int max_profit = 0;
        for(int i=0;i<n;i++){
            if(prices[i] < min_price){
                min_price = prices[i];
            }
            else{
                int profit = prices[i] - min_price;
                max_profit = Math.max(max_profit, profit);
            }
        }
        return max_profit;
    }
}
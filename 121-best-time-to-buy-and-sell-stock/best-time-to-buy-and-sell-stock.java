class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy_price = prices[0];
        int max_Profit = 0;
        for(int i=0;i<n;i++){
            if(prices[i] < buy_price){
                buy_price = prices[i];
            }
            else{
                int Profit = prices[i] - buy_price;
                max_Profit = Math.max(max_Profit, Profit);
            }
        }
        return max_Profit;
    }
}
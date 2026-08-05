class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min_price = prices[0];
        int max_price = 0;
        for(int i=1;i<n;i++){
            if(min_price > prices[i]){
                min_price = prices[i];
            }
            else{
                max_price = Math.max(max_price, prices[i] - min_price);
            }
        }
        return max_price;
    }
}
class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        if(n<2) return arr[0];
        int[] skipLastHouse = new int[n-1];
        int[] skipFirstHouse = new int[n-1];
        for(int i=0;i<n-1;i++){
            skipLastHouse[i] = arr[i];
            skipFirstHouse[i] = arr[i+1];
        }
        int lootskippinglast = robhelper(skipLastHouse);
        int lootskippingfirst = robhelper(skipFirstHouse);
        return Math.max(lootskippinglast, lootskippingfirst);
    }
    public int robhelper(int [] arr){
        int n = arr.length;
        int[] dp = new int[n+1];
        dp[0] = arr[0];
        if(n>1) dp[1] = Math.max(arr[0], arr[1]);
        for(int i=2;i<n;i++){
            dp[i] = Math.max(arr[i] + dp[i-2], dp[i-1]);
        }
        return dp[n-1];
        
    }
}
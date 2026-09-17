class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp = new int[n+1];
        int res1 = 0;
        int res2 = 0;
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i=2;i<=n-1;i++){
            int take = nums[i-1] + dp[i-2];
            int skip = dp[i-1];
            dp[i] = Math.max(take, skip);
        }
        res1 = dp[n-1];
        dp[0] = 0;
        dp[1]  = 0;
        for(int i=2;i<=n;i++){
            int take = nums[i-1] + dp[i-2];
            int skip = dp[i-1];
            dp[i] = Math.max(take, skip);
        }
        res2 = dp[n];
        return dp[n] = Math.max(res1, res2);
    }
}
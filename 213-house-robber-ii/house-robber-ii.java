class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp1 = new int[n+1];
        Arrays.fill(dp1, -1);
        int[] dp2 = new int[n+1];
        Arrays.fill(dp2, -1);
        int case1 = solve(nums, 0, n-1, dp1);
        int case2 = solve(nums, 1, n, dp2);
        return Math.max(case1, case2);
    }
    public int solve(int[] nums, int idx, int n, int[] dp){
        if(idx>=n) return 0; 
        if(dp[idx] != -1) return dp[idx];
        int take = nums[idx] + solve(nums, idx+2, n, dp);
        int skip = solve(nums, idx+1, n, dp);
        return dp[idx] = Math.max(take, skip);
    }
}
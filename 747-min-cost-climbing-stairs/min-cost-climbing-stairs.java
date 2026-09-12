class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return Math.min(solve(0, cost, dp), solve(1, cost, dp));
    }
    public int solve(int idx, int[] cost, int[] dp){
        int n = cost.length;
        if(idx >= n) return 0;
        if(dp[idx] != -1) return dp[idx];
        return dp[idx] = cost[idx] + Math.min(solve(idx+1, cost, dp), solve(idx+2, cost, dp));
    }
}
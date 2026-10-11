class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;

        int[][] dp = new int[n+1][amount+1];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(amount, coins, 0, n, dp);
    }
    public int solve(int amount, int[] coins, int i, int n, int[][] dp){
        if(amount == 0) return 1;

        if(i==n) return 0;

        if(amount < 0){
            return 0;
        }
        
        if(dp[i][amount] != -1) return dp[i][amount];

        int skip = solve(amount, coins, i+1, n, dp);
        int take = solve(amount - coins[i], coins, i, n, dp);

        return dp[i][amount] = take + skip;
    }
}
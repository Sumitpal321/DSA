class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return solve(0, 0, dungeon, m, n, dp);
    }
    public int solve(int i, int j, int[][] dungeon, Integer m, Integer n, int[][] dp){
        if(i>=m || j>=n) return Integer.MAX_VALUE;
        if(i==m-1 && j==n-1){
            if(dungeon[i][j] <= 0) return Math.abs(dungeon[i][j]) + 1;
            else return 1;
        }
        if(dp[i][j] != -1) return dp[i][j];
        int rightways = solve(i, j+1, dungeon, m, n, dp);
        int downways = solve(i+1, j, dungeon, m, n, dp);
        int result = Math.min(rightways, downways) - dungeon[i][j];

        return dp[i][j] = result <= 0 ? 1 : result;
    }
}
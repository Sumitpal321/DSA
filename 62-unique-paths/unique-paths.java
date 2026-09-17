class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return solve(m, n, 0, 0, dp);
    }
    public int solve(Integer m, Integer n, int row, int col, int[][] dp){
        if(row == m-1 || col == n-1) return 1;
        if(row<0 || row>m || col<0 || col>n) return 0;
        if(dp[row][col] != -1) return dp[row][col];
        int rightways = solve(m, n, row, col+1, dp);
        int downways = solve(m, n, row+1, col, dp);
        return dp[row][col] = rightways + downways;
    }
}
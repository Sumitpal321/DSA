class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }

        return solve(grid, 0, 0, m, n, dp);
    }
    public int solve(int[][] grid, int row, int col, Integer m, Integer n, int[][] dp){
        if(row>m || col>n) return 0;
        if(row == m-1 && col == n-1) return grid[row][col];
        if(dp[row][col] != -1) return dp[row][col];
        if(row == m-1){
            return grid[row][col] + solve(grid, row, col+1, m, n, dp);
        }
        else if(col == n-1){
            return grid[row][col] + solve(grid, row+1, col, m, n, dp);
        }
        else{
            return dp[row][col] = grid[row][col] + Math.min(solve(grid, row, col+1, m, n, dp), solve(grid, row+1, col, m, n, dp));
        }
    }
}
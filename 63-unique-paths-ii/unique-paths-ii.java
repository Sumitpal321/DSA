class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int [][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return paths(0, 0, m, n, arr, dp);
    }
    public int paths(int row, int col, Integer m, Integer n,int [][] arr, int [][] dp){
        if(row>=m || col>=n) return 0;
        if(arr[row][col] == 1) return 0;
        if(row==m-1 && col==n-1) return 1;
        if(dp[row][col] != -1) return dp[row][col];
        int rightways = paths(row, col+1, m, n,arr, dp);
        int downways = paths(row+1, col, m, n,arr, dp);
        return dp[row][col] = rightways + downways;
    }
}
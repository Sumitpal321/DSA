class Solution {
    public int minPathSum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = -1;
            }
        }
        return paths(m-1, n-1,arr,dp);
    }
    public int paths(int m, int n,int [][] arr, int[][] dp){
        if(m<0 || n<0) return Integer.MAX_VALUE;
        if(m==0 && n==0) return arr[0][0];
        if(dp[m][n]!=-1) return dp[m][n];
        int rightways = paths(m, n-1, arr, dp);
        int downways = paths(m-1, n, arr, dp);
        return dp[m][n] = arr[m][n] + Math.min(rightways, downways);
    }
}
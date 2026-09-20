class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        int minSum = Integer.MAX_VALUE;
        for(int col=0;col<n;col++){
            minSum = Math.min(minSum, solve(matrix, 0, col, m, n, dp));
        }
        return minSum;
    }
    public int solve(int[][] matrix, int row, int col, Integer m, Integer n, int[][] dp){
        if(row == m-1) return matrix[row][col];
        if(dp[row][col] != Integer.MAX_VALUE) return dp[row][col];

        int min = Integer.MAX_VALUE;

        int sum = matrix[row][col];

        int downleft = Integer.MAX_VALUE;
        if(row+1<m && col - 1>=0){
            downleft = sum + Math.min(min, solve(matrix, row+1, col-1, m, n, dp));
        }

        int down = Integer.MAX_VALUE;
        if(row+1<m){
            down = sum + Math.min(min, solve(matrix, row+1, col, m, n, dp));
        }

        int downright = Integer.MAX_VALUE;
        if(row+1<m && col+1<n){
            downright = sum + Math.min(min, solve(matrix, row+1, col+1, m, n, dp));
        }

        return dp[row][col] = Math.min(downleft, Math.min(down, downright));
    }
}
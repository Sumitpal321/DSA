class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m+1][n+1];

        for(int col=0;col<n;col++){
            dp[0][col] = matrix[0][col];
        }

        for(int row=1;row<m;row++){
            for(int col=0;col<n;col++){
                int a = Integer.MAX_VALUE;
                int b = Integer.MAX_VALUE;

                if(col-1>=0){
                    a = dp[row-1][col-1];
                }

                if(col+1<n){
                    b = dp[row-1][col+1];
                }

                dp[row][col] = matrix[row][col] + Math.min(dp[row-1][col], Math.min(a, b));
            }
        }
        int result = Integer.MAX_VALUE;
        int lastRow = n-1;
        for(int col=0;col<n;col++){
            result = Math.min(result, dp[lastRow][col]);
        }
        return result;
    }
}
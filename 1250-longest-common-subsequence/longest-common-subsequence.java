class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(text1, text2, 0, 0, m, n, dp);
    }
    public int solve(String text1, String text2, int i, int j, Integer m, Integer n, int[][] dp){
        if(i>=m || j>=n) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(text1.charAt(i) == text2.charAt(j)) return 1 + solve(text1, text2, i+1, j+1, m, n, dp);

        return dp[i][j] = Math.max(solve(text1, text2, i+1, j, m, n, dp), solve(text1, text2, i, j+1, m, n, dp));
    }
}
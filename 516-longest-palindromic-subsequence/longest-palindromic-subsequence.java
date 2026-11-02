class Solution {
    int[][] dp = new int[1001][1001];
    public int longestPalindromeSubseq(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int n = s.length();

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return solve(s, s2, n, n);
    }
    public int solve(String s, String s2, Integer m, Integer n){
        if(m==0 || n==0) return 0;

        if(dp[m][n] != -1) return dp[m][n];

        if(s.charAt(m-1) == s2.charAt(n-1)){
            return dp[m][n] = 1 + solve(s, s2, m-1, n-1);
        }
        return dp[m][n] = Math.max(solve(s, s2, m, n-1), solve(s, s2, m-1, n));
    }
}
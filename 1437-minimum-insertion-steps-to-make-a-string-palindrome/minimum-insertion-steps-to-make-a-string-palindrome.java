class Solution {
    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        return s;
    }
    public int solve(int i, int j, StringBuilder a, StringBuilder b, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)){
            return dp[i][j] = 1 + solve(i-1, j-1, a, b, dp);
        }
        else return dp[i][j] = Math.max(solve(i-1, j, a, b, dp), solve(i, j-1, a, b, dp));
    }
    public int lcs(String text1, String text2){
        StringBuilder a = new StringBuilder(text1);
        StringBuilder b = new StringBuilder(text2);
        int m = a.length(); int n = b.length();
        int [][] dp = new int[m][n];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<n;j++) dp[i][j] = -1;
        }
        return solve(m-1, n-1, a, b, dp);
    }
    public int longestPalindromicsubsequence(String s){
        return lcs(s, reverse(s));
    }
    public int minInsertions(String s) {
        return s.length() - longestPalindromicsubsequence(s);
    }
}
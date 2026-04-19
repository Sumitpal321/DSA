class Solution {
     public int lps(String s, int i, int j, int [][] dp){
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i) == s.charAt(j)){
            return dp[i][j] = 2 + lps(s, i+1, j-1, dp);
        }
        else return dp [i][j] = Math.max(lps(s, i+1, j, dp), lps(s, i, j-1, dp));

    }
    public int longestPalindromicsubsequence(String s){
        int [][] dp = new int[s.length()][s.length()];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return lps(s, 0, s.length()-1, dp);
    }
    public int minInsertions(String s) {
        return s.length() - longestPalindromicsubsequence(s);
    }
}
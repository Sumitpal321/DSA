class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        Boolean[][] dp = new Boolean[n][n+1];
        return solve(s, 0, 0, dp);
    }
    public boolean solve(String s, int idx, int count, Boolean[][] dp){
        int n = s.length();
        if(count < 0) return false;
        if(idx == n){
            return (count == 0);
        }
        if(dp[idx][count] != null) return dp[idx][count];

        boolean ans;
        if(s.charAt(idx) == '('){
            ans = solve(s, idx+1, count+1, dp);
        }
        else if(s.charAt(idx) == ')'){
            ans = solve(s, idx+1, count-1, dp);
        }
        else{
            boolean open = solve(s, idx+1, count+1, dp);
            boolean close = solve(s, idx+1, count-1, dp);
            boolean empty = solve(s, idx+1, count, dp);

            ans = open || close || empty;
        }
        dp[idx][count] = ans;
        return dp[idx][count];
    }
}
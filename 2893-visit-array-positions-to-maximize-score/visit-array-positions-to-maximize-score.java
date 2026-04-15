class Solution {
    public long solve(int i, int parity, int[] arr, int x, long[][] dp){
        if(i==arr.length) return 0;
        if(dp[i][parity]!=-1) return dp[i][parity];
        long pick = 0;
        int currentParity = arr[i]%2;
        if(currentParity == parity){
            pick = arr[i] + solve(i+1, currentParity, arr, x, dp);
        }
        else{
            pick = arr[i] - x + solve(i+1, currentParity, arr, x, dp);
        }
        long skip = solve(i+1, parity, arr, x, dp);
        return dp[i][parity] = Math.max(pick, skip);
    }
    public long maxScore(int[] arr, int x) {
        int n = arr.length;
        long[][] dp = new long[n][2];
        for(long[] row : dp){
            Arrays.fill(row, -1);
        }
        return arr[0] + solve(1, arr[0]%2, arr, x, dp);
    }
}
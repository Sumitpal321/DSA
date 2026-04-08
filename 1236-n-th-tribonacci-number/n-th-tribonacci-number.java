class Solution {
    int [] dp;
    public int find(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;

        if(dp[n]!=-1) return dp[n];
        dp[n] = find(n-1) + find(n-2) + find(n-3);

        return dp[n];

    }
    public int tribonacci(int n) {
        dp = new int[n+1];

        Arrays.fill(dp, -1);

        return find(n);
    }
}
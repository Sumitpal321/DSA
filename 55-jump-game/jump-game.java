class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        Boolean[] dp = new Boolean[n];
        return solve(nums, n, 0, dp);
    }
    public boolean solve(int[] nums, int n, int idx, Boolean[] dp){
        if(idx >= n-1) return true;
        if(nums[idx] == 0) return false;
        if(dp[idx] != null) return dp[idx];

        for(int i=1;i<=nums[idx];i++){
            if(solve(nums, n, idx+i, dp) == true){
                return dp[idx] = true;
            }
        }
        return dp[idx] = false;
    }
}
class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        if(sum % 2 != 0) return false;

        int target = sum / 2;
        
        Boolean [][] dp = new Boolean[n+1][target+1];

        return solve(nums, 0, target, n, dp);
    }
    public boolean solve(int[] nums, int idx, int target, int n, Boolean[][] dp){
        if(target == 0) return true;
        if(idx == n) return false;
        if(dp[idx][target] != null) return dp[idx][target];
        boolean skip = solve(nums, idx+1, target, n, dp);
        boolean take = false;
        if(nums[idx] <= target){
            take = solve(nums, idx+1, target - nums[idx], n, dp);
        }
        return dp[idx][target] = take || skip;
    }
}
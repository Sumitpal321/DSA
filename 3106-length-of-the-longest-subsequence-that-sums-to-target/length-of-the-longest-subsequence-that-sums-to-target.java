class Solution {
    public int solve(int i, int target, List<Integer> nums, int[][] dp){
        if(target == 0) return 0;
        if(i == nums.size()) return -100000;
        if(dp[i][target]!=-1) return dp[i][target];

        int skip = solve(i+1, target, nums, dp);
        int pick = -10000;
        if(target >= nums.get(i)){
            pick = 1 + solve(i+1, target-nums.get(i), nums, dp);
        }
        return dp[i][target] = Math.max(pick, skip);
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n = nums.size();
        int [][] dp = new int[n][target+1];
        for(int []row : dp){
            Arrays.fill(row, -1);
        }
        int ans = solve(0, target, nums, dp);
        return ans < 0 ? -1 : ans;
    }
}
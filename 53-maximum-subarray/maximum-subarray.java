class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<n;i++){
            currSum = Math.max(nums[i], nums[i] + currSum);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
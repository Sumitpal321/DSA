class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int leftsum = 0;
        int rightsum = 0;
        int max = 0;
        for(int i=0;i<k;i++){
            leftsum += nums[i];
        }
        max = leftsum;

        int j = n-1;
        for(int i=k-1;i>=0;i--){
            leftsum -= nums[i];
            rightsum += nums[j];
            j--;

            max = Math.max(max, leftsum+rightsum);
        }
        return max;
    }
}
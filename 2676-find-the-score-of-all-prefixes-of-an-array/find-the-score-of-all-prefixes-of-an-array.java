class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] result = new long[n];
        
        long preSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int converEle = nums[i];
            if(nums[i]>max) max = nums[i];
            converEle += max;
            preSum += converEle;
            result[i] = preSum;
        }
        return result;
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i =0;
        int j=0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        while(j<n){
            sum += nums[j];

            while(sum>=target){
                int len = j-i+1;
                if(len < minlen){
                    minlen = len;
                }
                sum -= nums[i];
                i++;
            }
            j++;
        }
        if(minlen == Integer.MAX_VALUE) return 0;
        return minlen;
    }
}
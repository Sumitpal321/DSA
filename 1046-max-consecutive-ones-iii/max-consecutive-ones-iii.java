class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        int zero = 0;
        int max_window_size = 0;
        for(int j=0;j<n;j++){
            if(nums[j] == 0){
                zero++;
            }

            int window_len = j-i+1;
            while(zero > k){
                if(nums[i] == 0){
                    zero--;
                }
                i++;
            }
            window_len = j-i+1;
            max_window_size = Math.max(max_window_size, window_len);
        }
        return max_window_size;
    }
}
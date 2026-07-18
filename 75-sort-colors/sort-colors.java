class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int noz = 0;
        int noo = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0) noz++;
            if(nums[i] == 1) noo++;
        }
        for(int i=0;i<n;i++){
            if(i<noz) nums[i] = 0;
            else if(i < noz+noo) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int lo = 0;
        int high = n - 1;
        int i = 0;
        while(i<=high){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[lo];
                nums[lo] = temp;
                i++;
                lo++;
            }
            else if(nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[high];
                nums[high] = temp;
                
                high--;
            }
            else{
                i++;
            }
        }
    }
}
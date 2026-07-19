class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int target_idx = -1;
        for(int i=n-1;i>0;i--){
            if(nums[i-1] < nums[i]){
                target_idx = i-1;
                break;
            }
        }

        if(target_idx!=-1){
            int swap_idx = target_idx;
            for(int j=n-1;j>target_idx;j--){
                if(nums[j]>nums[target_idx]){
                    swap_idx = j;
                    break;
                }
            }
            swap(nums, target_idx, swap_idx);
        }
        reverse(nums, target_idx+1 , n-1);
    }
}
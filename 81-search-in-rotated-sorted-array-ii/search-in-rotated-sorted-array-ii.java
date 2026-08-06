class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0;
        int hi = n - 1;
        int mid  = 0;
        while(lo<=hi){
            mid = lo + (hi - lo) / 2;
            if(nums[mid] == target) return true;
            if(nums[mid] == nums[lo] && nums[mid] == nums[hi]){
                lo++;
                hi--;
                continue;
            }
            else if(nums[mid] >= nums[lo]){
                if(nums[lo] <= target && target <= nums[mid]){
                    hi = mid - 1;
                }
                else lo = mid + 1;
            }
            else{
                if(target >= nums[mid] && target <= nums[hi]){
                    lo = mid + 1;
                }
                else hi = mid - 1;
            }
        }
        return false;
    }
}
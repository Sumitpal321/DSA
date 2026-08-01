class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int lo = 0;
        int high = n-1;
        int mid = 0;
        while(lo<=high){
            mid = lo + (high - lo)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid - 1;
            else{
                lo = mid+1;
            }
        }
        return lo;
    }
}
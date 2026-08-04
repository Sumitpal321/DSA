class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1, -1};

        ans[0] = firstIndex(nums, target);
        ans[1] = lastIndex(nums, target);
        return ans;
    }
    public int firstIndex(int[] nums, int target){
        int n = nums.length;
        int lo = 0;
        int hi = n-1;
        int mid = 0;
        int ans = -1;
        while(lo<=hi){
            mid = lo + (hi - lo)/2;
            if(nums[mid] == target){
                ans = mid;
                hi = mid-1;
            }
            else if(nums[mid] < target){
                lo = mid + 1;
            }
            else hi = mid -1;
        }
        return ans;
    }
    public int lastIndex(int[] nums, int target){
        int n = nums.length;
        int lo = 0;
        int hi = n-1;
        int mid = 0;
        int ans = -1;
        while(lo<=hi){
            mid = lo + (hi - lo)/2;
            if(nums[mid] == target){
                ans = mid;
                lo = mid + 1;
            }
            else if(nums[mid] < target){
                lo = mid + 1;
            }
            else hi = mid -1;
        }
        return ans;
    }
}
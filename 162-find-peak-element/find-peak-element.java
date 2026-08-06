class Solution {
    public int findPeakElement(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Peak lies on the right side
                lo = mid + 1;
            } else {
                // Peak lies on the left side (including mid)
                hi = mid;
            }
        }

        return lo;
    }
}
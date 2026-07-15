class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] sorted_arr = nums.clone();
        Arrays.sort(sorted_arr);
        for(int x=0;x<n;x++){
            boolean isMatch = true;
            for(int i=0;i<n;i++){
                if (nums[i] != sorted_arr[(i + x) % n]) {
                    isMatch = false;
                    break;
                }
            }
            if(isMatch) return true;
        }
        return false;
    }
}
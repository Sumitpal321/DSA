class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int [] ans = {-1, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int targetValue = target - nums[i];

            if(map.containsKey(targetValue)){
                ans[0] = i;
                ans[1] = map.get(targetValue);
                break;
            }
            else map.put(nums[i], i);
        }
        return ans;
    }
}
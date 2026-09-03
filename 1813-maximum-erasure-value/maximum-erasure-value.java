class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int max_score = 0;
        int sum = 0;
        int i = 0;
        int j = 0;
        while(j<n){
            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }

            set.add(nums[j]);
            sum += nums[j];

            max_score = Math.max(max_score, sum);
            j++;
        }
        return max_score;
    }
}
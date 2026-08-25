class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long result = 0;
        long sum = 0;
        HashSet<Integer> set = new HashSet<>();
        int i=0;
        int j = 0;
        while(j<n){
            while(set.contains(nums[j])){
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }

            sum += nums[j];
            set.add(nums[j]);

            if(j-i+1 == k){
                result = Math.max(result, sum);
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return result;
    }
}
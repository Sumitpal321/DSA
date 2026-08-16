class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int pre_sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            pre_sum += nums[i];
            if(map.containsKey(pre_sum - k)){
                count += map.get(pre_sum - k);
            }
            if(map.containsKey(pre_sum)){
                int freq = map.get(pre_sum);
                map.put(pre_sum, freq + 1);
            }
            else map.put(pre_sum, 1);
        }
        return count;
    }
}
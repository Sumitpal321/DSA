class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]) count++;
            }
            if(count > n/3 && !ans.contains(nums[i])) ans.add(nums[i]);
        }
        return ans;
    }
}
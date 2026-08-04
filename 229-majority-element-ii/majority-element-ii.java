class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int count = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            if(ans.contains(nums[i])) continue;
            for(int j=i;j<n;j++){
                if(nums[i] == nums[j]) count++;
            }
            if(count>n/3) ans.add(nums[i]);
            count = 0;
        }
        return ans;
    }
}
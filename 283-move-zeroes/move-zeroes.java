class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int noz=0;
        for(int ele : nums){
            if(ele!=0){
                ans.add(ele);
            }
            else noz++;
        }
        for(int i=1;i<=noz;i++){
            ans.add(0);
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = ans.get(i);
        }
    }
}
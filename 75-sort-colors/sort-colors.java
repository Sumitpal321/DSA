class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i] == 0) ans.add(0);
        }
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                ans.add(1);
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i] == 2){
                ans.add(2);
            }
        }
        for(int i=0;i<n;i++){
            nums[i] = ans.get(i);
        }
    }
}
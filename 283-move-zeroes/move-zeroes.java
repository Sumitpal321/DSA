class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int noz = 0;
        int i = 0;
        for(int j=i;j<n;j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
            else noz++;
        }
        for(i=n-noz;i<n;i++){
            nums[i] = 0;
        }
    }
}
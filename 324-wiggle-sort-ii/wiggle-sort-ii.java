class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Arrays.sort(nums);

        int left = (n-1) / 2;
        int right = n-1;

        for(int i=0;i<n;i++){
            if(i%2 == 0){
                ans[i] = nums[left--];
            }
            else ans[i] = nums[right--];
        }
        for(int i=0;i<n;i++){
            nums[i] = ans[i];
        }
    }
}
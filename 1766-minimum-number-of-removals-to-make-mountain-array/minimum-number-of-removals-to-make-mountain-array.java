class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n];
        int[] lds = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i-1;j++){
                if(nums[j]<nums[i]){
                    lis[i] = Math.max(lis[i], lis[j]);
                }
            }
            lis[i] += 1;
        }
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=i+1;j--){
                if(nums[j]<nums[i]){
                    lds[i] = Math.max(lds[i], lds[j]);
                }
            }
            lds[i] += 1;
        }
        int maxmountain = 0;
        for(int i=0;i<n;i++){
            if(lis[i]>1 && lds[i]>1){
                int mountainlen = lis[i] +lds[i] - 1;
                maxmountain = Math.max(maxmountain, mountainlen);
            }
        }
        return n - maxmountain;
    }
}
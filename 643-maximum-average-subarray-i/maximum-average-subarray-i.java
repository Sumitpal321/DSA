class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        int max_sum = sum;
        int i=0;
        int j=k;
        while(j<n){
            sum -= nums[i];
            i++;

            sum += nums[j];
            j++;

            max_sum = Math.max(max_sum, sum);
        }
        return (double) max_sum / k;
    }
}
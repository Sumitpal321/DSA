class Solution {
    public long countSubarrays(int[] arr, long k) {
        int n = arr.length;
        long count = 0;
        int i = 0;long sum = 0;
        for(int j=0;j<n;j++){
            sum += arr[j];
            while(sum * (j - i + 1) >= k){
                sum -= arr[i];
                i++;
            }
            count += (j - i + 1);
        }
        return count;
    }
}
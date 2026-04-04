class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int n = arr.length;
        int prod = 1;
        int i=0;
        int count = 0;
        for(int j=0;j<n;j++){
            prod *= arr[j];

            while(prod>=k && i<=j){
                prod /= arr[i];
                i++;
            }
            count += j - i + 1;
        }

        return count;
    }
}
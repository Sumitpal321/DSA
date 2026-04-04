class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int i = 0;
        for(int j=0;j<n;j++){
            sum += arr[j];
            while(sum>=target){
                int len = j - i + 1;
                minLen = Math.min(len, minLen);

                sum -= arr[i];
                i++;
            }
        }
        return (minLen==Integer.MAX_VALUE) ? 0 : minLen;
    }
}
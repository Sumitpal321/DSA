class Solution {
    public int longestSubarray(int[] arr) {
        int n = arr.length;
        int zeroes = 0;
        int i = 0;
        int maxLen = Integer.MIN_VALUE;
        for(int j=0;j<n;j++){
            if(arr[j] == 0) zeroes++;

            while(zeroes > 1){
                if(arr[i] == 0){
                    zeroes--;
                }
                i++;
            }
            int len = j - i;
            maxLen = Math.max(len, maxLen);
        }
        return maxLen;
    }
}
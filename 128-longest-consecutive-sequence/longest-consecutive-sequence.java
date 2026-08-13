class Solution {
    public int longestConsecutive(int[] arr) {
        int n = arr.length;

        if (n == 0) {
            return 0;
        }

        Arrays.sort(arr);

        int i = 1;
        int currentLen = 1;
        int len = 1;

        while (i < n) {

            int diff = arr[i] - arr[i - 1];

            if (diff == 1) {
                currentLen++;
            }
            else if (diff == 0) {
                // duplicate, don't increase currentLen
            }
            else {
                currentLen = 1;
            }

            len = Math.max(len, currentLen);
            i++;
        }

        return len;
    }
}
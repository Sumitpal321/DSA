class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        int i = 0;
        int maxwindow = 0;
        int maxFreq = 0;
        for(int j=0;j<n;j++){
            freq[s.charAt(j) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);

            int windowlen = j-i+1;
            if(windowlen - maxFreq > k){
                freq[s.charAt(i) - 'A']--;
                i++;
            }

            windowlen = j-i+1;
            maxwindow = Math.max(windowlen, maxwindow);
        }
        return maxwindow;
    }
}
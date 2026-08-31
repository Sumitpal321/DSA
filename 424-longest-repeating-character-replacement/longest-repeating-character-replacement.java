class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        int i = 0;
        int maxwindow = 0;
        int maxfreq = 0;
        for(int j=0;j<n;j++){
            freq[s.charAt(j) - 'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(j) - 'A']);

            int window_len = j-i+1;
            if(window_len - maxfreq > k){
                freq[s.charAt(i) - 'A']--;
                i++;
            }
            window_len = j-i+1;
            maxwindow = Math.max(maxwindow, window_len);
        }
        return maxwindow;
    }
}
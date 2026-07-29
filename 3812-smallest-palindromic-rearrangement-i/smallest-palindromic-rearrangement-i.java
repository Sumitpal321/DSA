class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] freq = new int[128];
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }

        char [] ans = new char[n];
        char mid = '\0';
        int left = 0;
        int right = n - 1;

        for(char ch='a';ch<='z';ch++){
            while(freq[ch]>=2){
                ans[left++] = ch;
                ans[right--] = ch;
                freq[ch] -= 2;
            }
        }
        for(char ch='a';ch<='z';ch++){
            if(freq[ch] == 1){
                ans[left] = ch;
                break;
            }
        }
        return new String(ans);
    }
}
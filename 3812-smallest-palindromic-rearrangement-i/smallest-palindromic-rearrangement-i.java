class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] freq = new int[126];
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }

        char mid = '\0';
        StringBuilder left = new StringBuilder();

        for(char ch='a';ch<='z';ch++){
            while(freq[ch]>=2){
                left.append(ch);
                freq[ch] -= 2;
            }
            if(freq[ch] == 1){
                mid = ch;
            }
        }
        StringBuilder right  = new StringBuilder(left).reverse();
        if(mid != '\0') return left.toString() + mid + right.toString();
        return left.toString() + right.toString();
    }
}
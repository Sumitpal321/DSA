class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int i=0;
        int j=0;
        int maxlen = 0;
        while(j<n){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            int len = j-i+1;
            maxlen = Math.max(len, maxlen);

            j++;
        }
        return maxlen;
    }
}
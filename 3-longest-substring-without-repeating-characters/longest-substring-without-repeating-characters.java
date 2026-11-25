class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        while(j<n){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            j++;
            maxLen = Math.max(maxLen, j-i);
        }
        return maxLen;
    }
}
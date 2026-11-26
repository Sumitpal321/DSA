class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if(s.length() != t.length()) return false;

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for(int i=0;i<n;i++){
            if(sArr[i] != tArr[i]){
                return false;
            }
        }
        return true;
    }
}
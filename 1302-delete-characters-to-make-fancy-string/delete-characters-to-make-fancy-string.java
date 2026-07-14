class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);

            int len = ans.length();
            if(len >= 2 && ans.charAt(len-1)==ch && ans.charAt(len-2)==ch){
                continue;
            }
             ans.append(ch);
        }
        return ans.toString();
    }
}
class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        boolean[][] t = new boolean[n+1][n+1];
        t[n][0] = true;
        for(int i=n-1;i>=0;i--){
            for(int open=0;open<=n;open++){
                boolean isValid = false;
                if(s.charAt(i) == '*'){
                    if(open<n){
                        isValid |= t[i+1][open+1];
                    }
                    isValid |= t[i+1][open];
                    if(open>0){
                        isValid |= t[i+1][open-1];
                    }
                }
                else if(s.charAt(i) == '('){
                    if(open<n){
                        isValid |= t[i+1][open+1];
                    }
                }
                else{
                    if(open>0){
                        isValid |= t[i+1][open-1];
                    }
                }
                t[i][open] = isValid;
            }
        }
        return t[0][0];
    }
}
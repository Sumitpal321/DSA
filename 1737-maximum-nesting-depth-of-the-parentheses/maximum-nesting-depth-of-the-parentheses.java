class Solution {
    public int maxDepth(String s) {
        int openbracket = 0;

        int result = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                openbracket++;
            }
            else if(ch == ')'){
                openbracket--;
            }
            result = Math.max(result, openbracket);
        }
        return result;
    }
}
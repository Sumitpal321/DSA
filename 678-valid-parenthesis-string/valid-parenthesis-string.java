class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        Stack<Integer> openSt = new Stack<>();
        Stack<Integer> asteriskSt = new Stack<>();

        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                openSt.push(i);
            }
            else if(s.charAt(i) == '*'){
                asteriskSt.push(i);
            }
            else{
                if(!openSt.isEmpty()){
                    openSt.pop();
                }
                else if(!asteriskSt.isEmpty()){
                    asteriskSt.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!openSt.isEmpty() && !asteriskSt.isEmpty()){
                if(openSt.peek() > asteriskSt.peek()){
                    return false;
                }
                openSt.pop();
                asteriskSt.pop();
            }
        return openSt.isEmpty();
    }
}
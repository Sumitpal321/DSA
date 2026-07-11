class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(st.isEmpty() || st.peek()!=ch){
                st.push(ch);
            }
            else st.pop();
        }
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
}
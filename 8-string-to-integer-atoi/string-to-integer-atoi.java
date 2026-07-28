class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        
        int n = s.length();
        int i = 0;
        
        if(n==0) return 0;

        int sign = 1;
        if(s.charAt(0) == '+' || s.charAt(0) == '-'){
            if(s.charAt(0) == '-'){
                sign = -1;
            }
            i++;
        }
        int num = 0;

        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            if(num > Integer.MAX_VALUE/10 || num == Integer.MAX_VALUE/10 && digit > 7){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }
        return sign * num;
    }
}
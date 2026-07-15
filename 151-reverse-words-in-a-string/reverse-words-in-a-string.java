class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();

        char[] sArr = s.toCharArray();

        reverse(sArr, 0, n-1);

        for(int i=0;i<n;i++){
            if(sArr[i] == ' ') continue;

            StringBuilder word = new StringBuilder();
            while(i<n && sArr[i] != ' '){
                word.append(sArr[i]);
                i++;
            }
            char[] wordArr = word.toString().toCharArray();
            reverse(wordArr, 0, word.length() - 1);

            if(wordArr.length>0){
                ans.append(" ").append(new String(wordArr));
            }
        }
        return ans.length() >0 ? ans.substring(1) : "";
    }
    public void reverse(char[] sArr, int i, int j){
        while(i<j){
            char temp = sArr[i];
            sArr[i] = sArr[j];
            sArr[j] = temp;
            i++;
            j--;
        }
    }
}
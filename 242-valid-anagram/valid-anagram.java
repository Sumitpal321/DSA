class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : sArr){
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch, freq+1);
            }
            else map.put(ch, 1);
        }

        for(char ch : tArr){
            if(!map.containsKey(ch) || map.get(ch)==0){
                return false;
            }
            int freq = map.get(ch);
            map.put(ch, freq - 1); 
           
        }
        return true;
    }
}
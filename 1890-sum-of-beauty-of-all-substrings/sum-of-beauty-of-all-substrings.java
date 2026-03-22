class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int count = 0;
        for(int i=0;i<n;i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0)+ 1);
                int max = 0;
                int min = Integer.MAX_VALUE;

                for(int freq : map.values()){
                    max = Math.max(max, freq);
                    min = Math.min(min, freq);
                }
                count += (max - min);
            }
        }
        return count;
    }
}
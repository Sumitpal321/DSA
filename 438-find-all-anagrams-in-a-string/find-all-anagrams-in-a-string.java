class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
         List<Integer> ans = new ArrayList<>();
        int[] sFreq = new int[26];
        int[] pFreq = new int[26];

        for(int k=0;k<m;k++){
            pFreq[p.charAt(k) - 'a']++;
        }

        int i=0;
        int j=0;

        while(j<n){
            sFreq[s.charAt(j) - 'a']++;

            if(j-i+1 > m){
                sFreq[s.charAt(i) - 'a']--;
                i++;
            }

            if(j-i+1 == m){
                if(Arrays.equals(sFreq, pFreq)) ans.add(i);;
            }
            j++;
        }
        return ans;
    }
}
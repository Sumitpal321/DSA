class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length;
        int n = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int left = 0;
        int right = 0;

        while(left < n && right < m){
            if(g[right] <= s[left]){
                right = right + 1;
            }
            left = left + 1;
        }
        return right;
    }
}
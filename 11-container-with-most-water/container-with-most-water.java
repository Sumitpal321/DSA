class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int area  = 0;
        int lp = 0;
        int rp = n - 1;
        while(lp<rp){
            int wt = rp - lp;
            int ht = Math.min(height[lp], height[rp]);
            area = wt * ht;
            max = Math.max(max, area);
            if(height[lp] < height[rp]){
                lp++;
            }
            else rp--;
        }
        return max;
    }
}
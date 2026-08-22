class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max_area = 0;
        int lp = 0;
        int rp = n-1;
        while(lp<rp){
            int ht = Math.min(height[lp], height[rp]);
            int wt = rp - lp;
            int area = ht * wt;
            max_area = Math.max(max_area, area);
            if(height[lp] < height[rp]){
                lp++;
            }
            else rp--;
        }
        return max_area;
    }
}
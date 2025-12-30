class Solution {
    public boolean ispossible(int c, int []arr, int d){
        int n = arr.length;
        int days=1;
        int load = 0;
        for(int i=0;i<n;i++){
            if(load+arr[i] <= c) load += arr[i];
            else{
                load = arr[i];
                days++;
            }
        }
        if(days>d) return false;
        return true;
    }
    public int shipWithinDays(int[] arr, int d) {
        int n = arr.length;
        int sum = 0, mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx = Math.max(mx, arr[i]);
            sum += arr[i];
        }
        int lo=mx, hi=sum, minc=sum;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(ispossible(mid, arr, d)==true){
                minc=mid;
                hi = mid-1;
            }
            else  lo = mid+1;
        }
        return minc;
    }
}
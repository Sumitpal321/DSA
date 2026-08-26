class Solution {
    public int minimumCardPickup(int[] arr) {
        int n = arr.length;
        int min_len = Integer.MAX_VALUE;
        int len = 0;
        int i = 0;
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        while(j<n){
            while(set.contains(arr[j])){
                len = j-i+1;
                min_len = Math.min(min_len, len);
                
                set.remove(arr[i]);
                i++;
            }
            set.add(arr[j]);
            j++;
        }
        return min_len == Integer.MAX_VALUE ? -1 : min_len;
    }
}
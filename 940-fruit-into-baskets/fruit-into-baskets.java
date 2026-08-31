class Solution {
    public int totalFruit(int[] nums) {
        int n = nums.length;
        int i=0;
        int maxwindow = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j=0;j<n;j++){
            if(map.containsKey(nums[j])){
                int freq = map.get(nums[j]);
                map.put(nums[j], freq+1);
            }
            else map.put(nums[j], 1);

            while(map.size() > 2){
                int freq = map.get(nums[i]);

                if(freq == 1){
                    map.remove(nums[i]);
                }
                else{
                    map.put(nums[i], freq-1);
                }
                i++;
            }
            int window_len = j-i+1;
            maxwindow = Math.max(window_len, maxwindow);
        }
        return maxwindow;
    }
}
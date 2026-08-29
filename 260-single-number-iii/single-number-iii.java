class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
            else map.put(ele, 1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int ele : map.keySet()){
            int key = map.get(ele);
            if(key == 1){
                ans.add(ele);
            }
        }
        return new int[]{ans.get(0), ans.get(1)};
    }
}
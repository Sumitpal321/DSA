class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
            else{
                map.put(ele, 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) > nums.length / 3) ans.add(key);
        }
        return ans;
    }
}
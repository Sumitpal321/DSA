class Solution {
    public int totalFruit(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        int maxFruit = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(j<n){
            if(map.containsKey(arr[j])){
                int freq = map.get(arr[j]);
                map.put(arr[j], freq+1);
            }
            else map.put(arr[j], 1);

            while(map.size()>2){
                int freq = map.get(arr[i]);
                if(freq == 1) map.remove(arr[i]);
                else map.put(arr[i], freq-1);
                i++;
            }
            int len = j-i+1;
            maxFruit = Math.max(len, maxFruit);
            j++;
        }
        return maxFruit;

    }
}
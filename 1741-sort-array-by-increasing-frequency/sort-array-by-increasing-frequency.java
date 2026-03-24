class Solution {
    public class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }
        public int compareTo(Pair p){
            if(this.freq == p.freq){
                return p.ele - this.ele;
            }
            return this.freq - p.freq;
        }
    }
    public int[] frequencySort(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }
            else map.put(ele, 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pair(ele, freq));
        }
        int []ans = new int [arr.length];
        int idx = 0;
        while(pq.size()>0){
            Pair p = pq.remove();
            for(int i=0;i<p.freq;i++){
                ans[idx++] = p.ele;
            }
        }
        return ans;
    }
}
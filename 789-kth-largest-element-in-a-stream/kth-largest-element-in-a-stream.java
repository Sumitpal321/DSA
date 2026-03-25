class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] arr) {
        this.k = k;
        pq = new PriorityQueue<>();
        for(int ele : arr){
            add(ele);
        }
    }
    
    public int add(int val) {
        if(pq.size()<k || val>pq.peek()){
            pq.add(val);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
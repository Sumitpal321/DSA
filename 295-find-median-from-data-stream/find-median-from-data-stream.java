class MedianFinder {
    PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> MinHeap = new PriorityQueue<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(MaxHeap.size()==0) MaxHeap.add(num);
        else if(num<MaxHeap.peek()) MaxHeap.add(num);
        else MinHeap.add(num);

        if(MaxHeap.size()==MinHeap.size()+2){
            int top = MaxHeap.remove();
            MinHeap.add(top);
        }
        
        if(MinHeap.size()==MaxHeap.size()+2){
            int top = MinHeap.remove();
            MaxHeap.add(top);
        }
    }
    
    public double findMedian() {
        if(MaxHeap.size()==MinHeap.size()){
            return (MaxHeap.peek()+MinHeap.peek())/2.0;
        }
        else if(MaxHeap.size()>MinHeap.size()){
            return MaxHeap.peek();
        }
        else return MinHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
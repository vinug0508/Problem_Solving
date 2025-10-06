class KthLargest {
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int size;

    public KthLargest(int k, int[] nums) {
        size=k;
        for(int num:nums){
            minHeap.add(num);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        minHeap.add(val);

        if(minHeap.size() > size){
            minHeap.poll();
        }

        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
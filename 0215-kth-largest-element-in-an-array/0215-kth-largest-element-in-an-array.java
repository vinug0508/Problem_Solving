// by using MaxHeap approach
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // We use Collections.reverseOrder() to make Java's default Min Heap 
        // behave like a Max Heap (largest element at the root).
        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());

        for(int num:nums){
            maxHeap.add(num);
        } 

        for(int i=0;i<k-1;i++){
            maxHeap.poll();
        }

        return maxHeap.peek();
    }
}
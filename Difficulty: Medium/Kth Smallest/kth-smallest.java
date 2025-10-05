// User function Template for Java

// bu using min Heap approach
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num: arr){
            maxHeap.add(num);
            
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        
        return maxHeap.peek();
    }
}

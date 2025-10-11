class Solution {
    public static int minCost(int[] arr) {
        // code here
        int n=arr.length;
        int ans=0;
        
        if(n<=1) return 0;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int num:arr){
            minHeap.add(num);
        }
        
        while(minHeap.size()>1){
            int first = minHeap.poll();
            int second = minHeap.poll();
            
            int cost = first+second;
            ans+=cost;
            
            minHeap.add(cost);
        }
        return ans;
    }
}
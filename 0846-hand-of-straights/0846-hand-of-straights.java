class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        int n=hand.length;

        if(n%groupSize!=0) return false;
        if(groupSize==1) return true;

        HashMap<Integer, Integer> mpp = new HashMap<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num:hand){
            mpp.put(num, mpp.getOrDefault(num, 0)+1);
            minHeap.add(num);
        }

        while(!minHeap.isEmpty()){
            //// Get the smallest card without removing it yet
            int startCard=minHeap.peek();
            if(mpp.get(startCard)==0){
                minHeap.poll();
                continue;
            }
            mpp.put(startCard, mpp.get(startCard)-1);
            minHeap.poll();

            // Try to form the rest of the group: startCard + 1, startCard + 2, ..., startCard + groupSize - 1
            for(int i=1;i<groupSize;i++){
                int currCard=startCard+i;
                // Check if the consecutive card exists and has available count
                if(mpp.getOrDefault(currCard,0)==0){
                    return false;
                }
                // Decrement its count as it's used in this group
                mpp.put(currCard, mpp.get(currCard)-1);
            }
        }

        return true;
    }
}
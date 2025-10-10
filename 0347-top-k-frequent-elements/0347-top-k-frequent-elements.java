class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];

        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int num:nums){
            mpp.put(num, mpp.getOrDefault(num,0)+1);
        }

        // solving using min-heap approach
        PriorityQueue<Integer> minheap = new PriorityQueue<>((a,b)->mpp.get(a)-mpp.get(b));

        for(int val: mpp.keySet()){
            minheap.add(val);
            if(minheap.size()>k) minheap.poll();
        }

        for(int i=k-1;i>=0;i--){
            ans[i]=minheap.poll();
        }

        return ans;
    }
}
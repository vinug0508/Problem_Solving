class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];

        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int num:nums){
            mpp.put(num, mpp.getOrDefault(num,0)+1);
        }

        List<Integer> res = mpp.entrySet().stream()
            // Sort by the map value (frequency) in descending order
            // The method comparingByValue().reversed() achieves the descending sort.
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            
            // Map the entry back to the key (the number itself)
            .map(Map.Entry::getKey)
            
            // Limit the list to the top k elements
            .limit(k)
            
            // Collect into a List<Integer>
            .collect(Collectors.toList());

        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }

        return ans;
    }
}
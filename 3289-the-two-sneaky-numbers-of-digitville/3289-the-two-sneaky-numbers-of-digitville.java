class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int ind = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int num:nums){
            mpp.put(num, mpp.getOrDefault(num,0)+1);
        }

        for(int key:mpp.keySet()){
            if(mpp.get(key)==2){
                ans[ind++]=key;
                if(ind==2) break;
            }
        }

        return ans;
    }
}
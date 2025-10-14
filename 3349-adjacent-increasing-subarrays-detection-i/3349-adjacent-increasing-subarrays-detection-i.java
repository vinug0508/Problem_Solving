class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        // 2*k<=n then space for two subarrays in list
        for(int i=0;i<=n-2*k;i++){
            if(checkingIn(nums, i, i+k-1) && 
            checkingIn(nums, i+k, i+2*k-1)){
                return true;
            }
        }
        return false;
    }

    private boolean checkingIn(List<Integer> nums, int start, int end){
        for(int i=start;i<end; i++){
            if(nums.get(i)>=nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
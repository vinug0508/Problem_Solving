class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int cnt=k;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cnt++;
            }else if(nums[i]==1){
                if(cnt<k) return false;
                cnt=0;
            }
        }
        return true;
    }
}
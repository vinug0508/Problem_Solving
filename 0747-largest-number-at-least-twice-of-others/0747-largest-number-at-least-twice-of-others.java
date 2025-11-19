class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secmax=0;
        int maxInd=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secmax=max;
                max=nums[i];
                maxInd=i;
            }else if(nums[i]>secmax){
                secmax=nums[i];
            }
        }
        
        return max>=2*secmax?maxInd:-1;
        
    }
}
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int n=nums.length;
        int median=nums[n/2];

        for(int num:nums){
            ans+=Math.abs(num-median);
        }

        return ans;
    }
}
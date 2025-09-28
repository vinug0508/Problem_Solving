class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        //we iterate backward through the sorted array, checking the    three largest available lengths at each step.
        for(int i=nums.length-3;i>=0;i--){
            if(nums[i]+nums[i+1]>nums[i+2]){
                return nums[i]+nums[i+1]+nums[i+2];
            }
        }

        return 0;
    }
}
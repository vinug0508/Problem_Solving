class Solution {
    public void moveZeroes(int[] nums) {
        int insert=0;
        for(int num:nums){
            // if num is 0 then we are going to skip
            if(num!=0){
                nums[insert]=num;
                insert++;
            }
        }

        while(insert<nums.length){
            nums[insert]=0;
            insert++;
        }
    }
}
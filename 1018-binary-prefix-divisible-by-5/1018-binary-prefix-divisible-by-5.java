class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int x=0;

        for(int i=0;i<nums.length;i++){
            x=(x*2 + nums[i])%5;
            ans.add(x==0);
        }

        return ans;
    }
}
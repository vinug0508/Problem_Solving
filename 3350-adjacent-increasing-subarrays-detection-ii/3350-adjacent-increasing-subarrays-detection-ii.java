class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();
        int ans=0;
        int cnt=1;
        int preCnt=0;

        for(int i=1;i<n;i++){
            if(nums.get(i)>nums.get(i-1)){
                cnt++;
            }else{
                preCnt=cnt; //last longest subarray
                cnt=1; // reset cnt to 1 again for new subarray 
            }
            // adjacent increasing subarrays of equal length.
            ans = Math.max(ans, Math.min(preCnt, cnt));
            // long increasing runs that can be split into two adjacent subarrays.
            ans = Math.max(ans,cnt/2);
        }

        return ans;
    }
}
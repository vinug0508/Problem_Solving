class Solution {
    public int smallestNumber(int n) {
        int ans=1;

        while(ans<n){
            ans=2*ans+1;
        }

        return ans;
    }
}
// Enumerate integers that contain only set bits: 1,3,7,15
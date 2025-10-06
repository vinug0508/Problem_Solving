class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int maxi=0;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,nums[i]);
        }

        int low=1;
        int high=maxi;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(sumByD(nums,mid)<=threshold){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return low;

    }

    private static int sumByD(int[] nums, int div){
        int n=nums.length;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)(nums[i]/(double)div));
        }

        return sum;
    }
}
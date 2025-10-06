class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int n=arr.length;
        
        int low=0;
        int high=n-1;
        //If we don’t find any index, we will return n
        int ans=n;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        
        return ans;
    }
}

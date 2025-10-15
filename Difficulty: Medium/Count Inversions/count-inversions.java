class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        int n=arr.length;
        return mergeSort(arr, 0, n-1);
    }
    
    private static int mergeSort(int[] arr, int low, int high){
        int cnt=0;
        int mid=(high+low)/2;
        
        if(low>=high) return cnt;
        
        cnt+=mergeSort(arr, low, mid);
        cnt+=mergeSort(arr, mid+1, high);
        cnt+=merge(arr, low, mid, high);
        
        return cnt;
    }
    
    private static int merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> ans = new ArrayList<>();
        int left=low;
        int right=mid+1;
        int cnt=0; 
        
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                ans.add(arr[left]);
                left++;
            }else{
                ans.add(arr[right]);
                cnt+=(mid-left+1);
                right++;
            }
        }
        
        while(left<=mid){
            ans.add(arr[left]);
            left++;
        }
        while(right<=high){
            ans.add(arr[right]);
            right++;
        }
        
        for(int i=low;i<=high;i++){
            arr[i]=ans.get(i-low);
        }
        
        return cnt;
    }
}
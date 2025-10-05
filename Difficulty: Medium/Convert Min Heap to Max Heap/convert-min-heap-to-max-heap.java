// User function Template for Java

class Solution {
    static void convertMinToMaxHeap(int N, int arr[]) {
        // code here
        int n=arr.length;
        
        for(int i=(N/2)-1;i>=0;i--){
            maxHeap(arr, N, i);
        }
    }
    
    private static void maxHeap(int[] arr, int n, int i){
        int large = i;
        int left = 2*i+1;
        int right = 2*i+2;
        
        if(left < n && arr[left]>arr[large]){
            large=left;
        }
        if(right < n && arr[right]>arr[large]){
            large=right;
        }
        
        // If the largest element is not the current root (i)
        if(large!=i){
            swap(arr,i,large);
            
            // recursively maxHeapify is going
            maxHeap(arr, n, large);
        }
    }
    
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

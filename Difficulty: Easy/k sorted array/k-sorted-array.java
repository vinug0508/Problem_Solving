// User function Template for Java

class Solution {
    static String isKSortedArray(int arr[], int n, int k) {
        // code here
        int[] sortArr = Arrays.copyOf(arr,n);
        Arrays.sort(sortArr);
        
        HashMap<Integer, Integer> mpp = new HashMap<>();
        
        for(int j=0;j<n;j++){
            mpp.put(sortArr[j], j);
        }
        
        for(int i=0;i<n;i++){
            int originalNumber = arr[i];
            
            int sortPosition=mpp.get(originalNumber);
            
            int dist = Math.abs(i-sortPosition);
            
            if(dist > k){
                return "No";
            }
        }
        
        return "Yes";
    }
}
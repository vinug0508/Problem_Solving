// User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
        int n=N;
        // if(n==0){
        //     return 0;
        // }
        
        int[] sortArr=Arrays.copyOf(arr,n);
        Arrays.sort(sortArr);
        
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int rank=1;
        
        for(int num:sortArr){
            if(!mpp.containsKey(num)){
                mpp.put(num, rank);
                rank++;
            }
        }
        
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            int number = arr[i];
            int numberRank = mpp.get(number);
            result[i]=numberRank;
        }
        
        return result;
    }
}

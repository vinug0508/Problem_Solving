// User function Template for Java

class Solution {

    public boolean countSub(long arr[], long n) {
        // Your code goes here
        int size = (int) n;
        
        // We only need to check the Max Heap property for the non-leaf nodes, 
        // which are at indices i = 0 up to (n/2 - 1).
        for(int i=0;i<=(size/2)-1;i++){
            long parent_value = arr[i];
            
            int left_index=2*i+1;
            // if exists left side value
            if(left_index<size){
                long left_side_value = arr[left_index];
                
                if(left_side_value>parent_value){
                    return false;
                }
            }
            
            int right_index=2*i+2;
            // if exists right side value
            if(right_index<size){
                long right_side_value = arr[right_index];
                
                if(right_side_value>parent_value){
                    return false;
                }
            }
        }
        
        return true;
    }
}
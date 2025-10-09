// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        // --- Global Maximum Tracking ---
        // We use 'long' for sums to prevent potential integer overflow, as per good practice.
        long maxSum = -1; 
        int maxStart = -1;
        int maxEnd = -1;
        
        // --- Current Subarray Tracking ---
        long currentSum = 0;
        int currentStart = 0; // Tracks the starting index of the current non-negative sequence.
        
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int element = arr[i];

            if (element >= 0) {
                // 1. Extend the current non-negative subarray
                currentSum += element;
                
                // Set the starting index if this is the beginning of a new sequence
                // (This handles the case after a negative number or at array start)
                if (i == 0 || arr[i-1] < 0) {
                    currentStart = i;
                }

                // 2. Comparison and Update Logic
                int currentLength = i - currentStart + 1;
                int maxLength = maxEnd == -1 ? 0 : maxEnd - maxStart + 1; // Handle initial state

                if (currentSum > maxSum) {
                    // Case A: Strictly greater sum -> Update everything
                    maxSum = currentSum;
                    maxStart = currentStart;
                    maxEnd = i;
                } else if (currentSum == maxSum) {
                    // Case B: Tie-breaker logic (equal sums)
                    
                    // Priority 1: Longest subarray
                    if (currentLength > maxLength) {
                        maxStart = currentStart;
                        maxEnd = i;
                    } 
                    // Priority 2: Smallest starting index (If lengths are equal, 
                    // the current start index *must* be larger than the stored maxStart
                    // for the loop to continue, so we only update on greater length)
                    
                    // The rule "return the one with the smallest starting index" is covered 
                    // by the length check, as the one with the smaller index will be encountered first 
                    // OR if lengths are equal, we stick to the existing one which has the smaller start index.
                }

            } else {
                // 3. Negative number found - break the non-negative sequence
                currentSum = 0; // Reset current sum
                // currentStart will be updated when the next non-negative number is found
            }
        }
        
        // --- Final Result Construction ---
        if (maxSum == -1) {
            // All elements were negative (or array was empty, though constraints say size >= 1)
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(-1);
            return ans;
        } else {
            // Construct the resulting subarray
            ArrayList<Integer> result = new ArrayList<>();
            for (int k = maxStart; k <= maxEnd; k++) {
                result.add(arr[k]);
            }
            return result;
        }
    }
}
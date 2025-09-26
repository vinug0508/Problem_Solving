// below has approach to refer
class Solution {
    public int triangleNumber(int[] nums) {
        int n=nums.length;
        int cnt=0;

        if(nums==null || n<3){
            return 0;
        }
        
        Arrays.sort(nums);

        for(int k=n-1;k>=2;k--){
            int i=0;
            int j=k-1;

            while(i<j){
                if(nums[i]+nums[j]>nums[k]){
                    cnt+=(j-i);
                    j--;
                }else{
                    i++;
                }
            }
        }

        return cnt;
    }
}

/*
This is a classic problem that tests your ability to combine a geometric property (the Triangle Inequality Theorem) with efficient array manipulation. Since you prefer an interview perspective, I'll structure the approach to focus on optimization.

Approach: Two Pointers on a Sorted Array (Optimal O(N 
2
 ))
The brute-force approach involves checking every possible triplet (a,b,c), which would be O(N 
3
 ), and is too slow for typical constraints. The optimal solution uses sorting and the Two Pointers technique to bring the complexity down to O(N 
2
 ).

1. The Core Idea: Triangle Inequality
For any three side lengths a,b,c to form a triangle, the following three conditions must hold:

a+b>c

a+c>b

b+c>a

2. Strategy: Sorting and Fixing the Largest Side
If we sort the array, we can simplify the three inequalities. Let's fix the largest side, c, and ensure a≤b≤c.

By sorting such that a≤b≤c, conditions 2 and 3 are automatically satisfied:

a+c>b (True, since c≥b and a>0)

b+c>a (True, since c≥a and b>0)

Therefore, we only need to check the first condition:

a+b>c
3. Algorithm Steps (The O(N 
2
 ) Solution)
Sort the Array: Sort the input array nums in non-decreasing order. This is an O(NlogN) operation.

Fix the Largest Side (Outer Loop): Iterate through the array from the right to fix the longest side, c. Let the index for c be k, ranging from N−1 down to 2 (since we need at least two other sides).

c=nums[k]

Find Pairs a and b (Inner Two-Pointers): For the fixed c at index k, we use two pointers, i and j, to find valid pairs (a,b) in the subarray nums[0...k-1].

Initialize the left pointer: i=0.

Initialize the right pointer: j=k−1.

Two-Pointer Logic: While i<j:

Case A: Valid Triplet Found (nums[i]+nums[j]>nums[k])

If the sum of the smallest available side nums[i] and the current side nums[j] is greater than nums[k], then any element between i and j (i.e., nums[i],nums[i+1],…,nums[j−1]) will also form a valid triplet when paired with nums[j].

The number of such valid pairs is (j−i).

Add this count (j−i) to the total.

Since we've counted all valid pairs involving nums[j], we move the right pointer inward: j−−.

Case B: Invalid Triplet (nums[i]+nums[j]≤nums[k])

If the sum is not large enough even with the current largest remaining side nums[j], then moving j inward won't help (the sum would only get smaller).

We must try a larger value for the smallest side a.

Move the left pointer inward: i++.

Return Count: After the loops complete, the total count will be the number of valid triplets.
 */
class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        // --- 2. Initialization ---
        // We use three variables to track T(n-3), T(n-2), and T(n-1)
        int t0 = 0; // Represents T(i-3) initially T(0)
        int t1 = 1; // Represents T(i-2) initially T(1)
        int t2 = 1; // Represents T(i-1) initially T(2)
        int nextTn = 0; // Will hold the calculated T(i)

        // --- 3. Iteration (from i=3 up to n) ---
        // The loop calculates T3, T4, ..., Tn
        for (int i = 3; i <= n; i++) {
            // Calculate the next term: T(i) = T(i-3) + T(i-2) + T(i-1)
            nextTn = t0 + t1 + t2;

            // --- 4. Shift the variables for the next iteration (i+1) ---
            // The value of T(i-2) becomes T((i+1)-3)
            t0 = t1;
            // The value of T(i-1) becomes T((i+1)-2)
            t1 = t2;
            // The value of T(i) becomes T((i+1)-1)
            t2 = nextTn;
        }

        // After the loop finishes, t2 holds the value of T(n)
        return t2;
    }
}
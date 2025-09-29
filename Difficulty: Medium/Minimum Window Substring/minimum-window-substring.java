class Solution {
    public String minWindow(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int minLen = Integer.MAX_VALUE, start = -1;

        for (int i = 0; i < m; i++) {
            if (s1.charAt(i) != s2.charAt(0)) continue;

            int j = i, k = 0;
            // Forward scan to find subsequence match
            while (j < m && k < n) {
                if (s1.charAt(j) == s2.charAt(k)) {
                    k++;
                }
                j++;
            }

            if (k == n) {
                // Backtrack to minimize window
                int end = j;
                k = n - 1;
                j--;
                while (j >= i) {
                    if (s1.charAt(j) == s2.charAt(k)) {
                        k--;
                        if (k < 0) break;
                    }
                    j--;
                }
                if (end - j < minLen) {
                    minLen = end - j;
                    start = j;
                }
            }
        }

        return start == -1 ? "" : s1.substring(start, start + minLen);
    }
}

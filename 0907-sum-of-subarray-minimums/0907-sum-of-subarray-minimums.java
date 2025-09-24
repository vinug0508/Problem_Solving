class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nse = nse(arr);
        int[] pse = psee(arr);

        long total=0;
        int mod = 1000000007;

        for(int i=0;i<n;i++){
            int left = i - pse[i];
            int right = nse[i] - i;

            total = (total + (left*right*1L*arr[i])%mod)%mod;
        }

        return (int) total;
    }

    private static int[] psee(int[] arr){
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        for(int i = 0; i < arr.length; i++){
            // we are storing indexes then
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return pse;
    }

    private static int[] nse(int[] arr){
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        for(int i = arr.length-1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return nse;
    }
}
class Solution {
    private int[] psee(int[] arr){
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        for(int i = 0; i < arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return pse;
    }

    private int[] nse(int[] arr){
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

        private int[] pLee(int[] arr){
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        for(int i = 0; i < arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return pse;
    }

    private int[] nLe(int[] arr){
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        for(int i = arr.length-1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return nse;
    }

    public long subArrayRanges(int[] nums) {
        long min = 0L;
        int[] left = psee(nums);
        int[] right = nse(nums);

        for(int i = 0; i < nums.length; i++){
            long leftNu = i - left[i];
            long rightNu = right[i] - i;

            min = (min + (leftNu * rightNu * nums[i]));
        }

        long max = 0L;
        int[] leftL = pLee(nums);
        int[] rightL = nLe(nums);

        for(int i = 0; i < nums.length; i++){
            long leftNu = i - leftL[i];
            long rightNu = rightL[i] - i;

            max = (max + (leftNu * rightNu * nums[i]));
        }

        return (max-min);
    }
}
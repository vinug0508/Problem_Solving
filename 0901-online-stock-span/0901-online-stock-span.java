class StockSpanner {

    private Stack<int[]> st;
    int ind;

    public StockSpanner() {
        st = new Stack<>();
        ind=-1;
    }
    
    public int next(int price) {
        ind = ind + 1;

        int cnt=1;

        while(!st.isEmpty() && st.peek()[0]<=price){
            cnt=cnt+st.pop()[1];
        }

        st.push(new int[]{price,cnt});

        return cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
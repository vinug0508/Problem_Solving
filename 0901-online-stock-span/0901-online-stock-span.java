class StockSpanner {

    private List<Integer> ans;
    public StockSpanner() {
        this.ans = new ArrayList<>();
    }
    
    public int next(int price) {
        ans.add(price);
        int cnt=1;

        for(int i = ans.size()-2;i>=0;i--){
            if(price>= ans.get(i)){
                cnt++;
            }else{
                break;
            }
        }
        return cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
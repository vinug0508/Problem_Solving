class MedianFinder {
    private List<Integer> ans;

    public MedianFinder() {
        ans=new ArrayList<>();
    }
    
    public void addNum(int num) {
        ans.add(num);
    }
    
    public double findMedian() {
        Collections.sort(ans);
        int n=ans.size();

        if(n%2==1){
            return ans.get(n/2);
        }
        
        return (ans.get((n/2)-1)+ans.get(n/2))/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
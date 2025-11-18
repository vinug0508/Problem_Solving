class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        int size=1<<n; //2^n

        for(int i=0;i<size;i++){
            ans.add(i^(i>>1));
        }

        return ans;
    }
}

// this ensures there only one bit flip at each step
/* gray code = i^(i>>1) */
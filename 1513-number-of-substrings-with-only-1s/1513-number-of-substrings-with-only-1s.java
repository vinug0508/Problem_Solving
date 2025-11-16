class Solution {
    public int numSub(String s) {
        long mod = 1000000007;
        long cnt=0;
        long res=0;

        for(char ch:s.toCharArray()){
            if(ch=='1'){
                cnt++;
                res=(res+cnt)%mod;
            }else if(ch=='0'){
                cnt=0;
            }
        }
        return (int) res;
    }
}
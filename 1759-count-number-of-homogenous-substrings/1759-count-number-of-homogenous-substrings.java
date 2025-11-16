class Solution {
    public int countHomogenous(String s) {
        long mod=1000000007;
        long res=0;
        long cnt=0;
        char prev='#';

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==prev){
                cnt++;
            }else{
                cnt=1;
                prev=ch;
            }
            res=(res+cnt)%mod;
        }
        return (int) res;
    }
}
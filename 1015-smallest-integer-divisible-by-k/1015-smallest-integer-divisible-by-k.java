class Solution {
    public int smallestRepunitDivByK(int k) {
        int n=1;
        int ans=0;

        if(even(k)) return -1;
        if(five(k)) return -1;

        while(n>0){
            if(n%k==0){
                ans=len(n);
                n=0;
            }else{
                n=n*10+1;
            }
        }

        return ans;
    }

    private static int len(int n){
        int cnt=0;

        while(n>0){
            int remain=n%10;
            cnt++;
            n/=10;
        }

        return cnt;
    }

    private static boolean even(int k){
        if(k%2==0){
            return true;
        }else{
            return false;
        }
    }

    private static boolean five(int k){
        if(k%5==0){
            return true;
        }else{
            return false;
        }
    }
}
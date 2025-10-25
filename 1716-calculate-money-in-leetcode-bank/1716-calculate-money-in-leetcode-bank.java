class Solution {
    public int totalMoney(int n) {
        int ans=0;

        int start=1;

        for(int i=1;i<=n;i++){
            ans+=start+(i-1)%7;
            if(i%7==0){
                start++;
            }
        }

        return ans;
    }
}
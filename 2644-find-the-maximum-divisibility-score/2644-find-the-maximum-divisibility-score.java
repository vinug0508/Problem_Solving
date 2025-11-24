class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int divisor=divisors[0];
        int maxCnt=0;

        for(int d:divisors){
            int cnt=0;

            for(int n:nums){
                if(n%d==0) cnt++;
            }

            if(cnt>maxCnt || (cnt==maxCnt && d<divisor)){
                maxCnt=cnt;
                divisor=d;
            }
        }

        return divisor;
    }
}
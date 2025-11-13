class Solution {
    public int maxOperations(String s) {
        int oprn=0;
        int cntOnes=0;
        boolean prevZero=false;

        for(char ch:s.toCharArray()){
            if(ch=='1'){
                cntOnes++;
                prevZero=false;
            }else if(ch=='0'){
                if(!prevZero){
                    oprn+=cntOnes;
                    prevZero=true;
                }
            }
        }
        return oprn;
    }
}
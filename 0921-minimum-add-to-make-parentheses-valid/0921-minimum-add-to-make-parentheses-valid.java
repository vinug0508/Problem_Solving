class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int insert=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                open++;
            }else{// ch==')'
                if(open>0){
                    open--;
                }else{
                    insert++;
                }
            }
        }

        return open+insert;
    }
}
class Solution {
    public boolean checkValidString(String s) {
        int max=0;
        int min=0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(c=='('){
                min+=1;
                max+=1;
            }else if(c==')'){
                min-=1;
                max-=1;
            }else{
                // in case of asterisk
                min-=1;
                max+=1;
            }
            if(min<0) min=0;

            if(max<0) return false;
        }
        return min==0;
    }
}
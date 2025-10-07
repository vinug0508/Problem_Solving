class Solution {
    public String removeOuterParentheses(String s) {
        int cnt=0;

        StringBuilder res = new StringBuilder();
        
        for(char c:s.toCharArray()){
            // we have to skip outermost opening and closing parenthesis
            // cnt 0 to 1 outermost opening parenthesis
            // cnt 1 to 0 outermost closing parenthesis
            if(c=='('){
                if(cnt>0){
                    // this is an internal opening parenthesis
                    res.append(c);
                }
                cnt++;
            }else{
                cnt--;
                if(cnt>0){
                    // this is an internal closing parenthesis 
                    res.append(c);
                }
            }
        }

        return res.toString();
    }
}
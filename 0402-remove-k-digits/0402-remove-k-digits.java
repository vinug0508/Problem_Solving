class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<num.length();i++){
            char curr = num.charAt(i);

            while(!st.isEmpty() && k>0 && 
            st.peek() > curr){
                st.pop();
                k--;
            }
            if(st.isEmpty() && curr=='0'){
                continue;
            }
            st.push(curr);
        }

        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        if(sb.length()==0){
            return "0";
        }
        int nonZeroIndex = 0;
        while (nonZeroIndex < sb.length() && sb.charAt(nonZeroIndex) == '0') {
            nonZeroIndex++;
        }
        
        String finalResult = sb.substring(nonZeroIndex);
        
        return finalResult.isEmpty() ? "0" : finalResult;
    }
}
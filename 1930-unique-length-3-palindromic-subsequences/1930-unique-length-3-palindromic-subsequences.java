class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans=0;

        Set<Character> set = new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }

        for(char letter:set){
            int i=-1;
            int j=0;

            for(int k=0;k<s.length();k++){
                if(s.charAt(k)==letter){
                    if(i==-1) i=k;
                    j=k;
                }
            }

            Set<Character> between = new HashSet<>();
            for(int k=i+1;k<j;k++){
                between.add(s.charAt(k));
            }

            ans+=between.size();
        }
        return ans;
    }
}
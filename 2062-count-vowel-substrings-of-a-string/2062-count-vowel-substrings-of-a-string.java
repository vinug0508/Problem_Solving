class Solution {
    public int countVowelSubstrings(String word) {
        int res=0;
        int n=word.length();

        for(int i=0;i<n;i++){
            if(!isVowel(word.charAt(i))) continue;
            Set<Character> set = new HashSet<>();

            for(int j=i;j<n;j++){
                // if char is not vowel
                if(!isVowel(word.charAt(j))) break;
                // if char is allow
                set.add(word.charAt(j));
                if(set.size()==5) res++;
            }
        }

        return res;
    }

    private boolean isVowel(char ch){
        return "aeiou".indexOf(ch)!=-1;
    }
}
class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        ans.add(words[0]);
        
        for(int i=1;i<words.length;i++){
            if(!isAnagram(words[i], words[i-1])){
                ans.add(words[i]);
            }
        }

        return ans;
    }

    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        if(s.length()!=t.length()){
            return false;
        }

        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }

        for(char c: t.toCharArray()){
            freq[c - 'a']--;
            if(freq[c - 'a'] < 0){
                return false;
            }
        }

        return true;
    }
}
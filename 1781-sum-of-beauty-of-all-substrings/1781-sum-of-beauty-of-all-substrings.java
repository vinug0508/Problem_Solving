class Solution {
    public int beautySum(String s) {
        // use hashmap to sove this

        int n=s.length();
        int sum=0;

        // we are traversing each substring by taking each character
        for(int i=0;i<n;i++){
            HashMap<Character, Integer> mpp = new HashMap<>();

            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                mpp.put(ch, mpp.getOrDefault(ch,0)+1);

                int maxi=Integer.MIN_VALUE;
                int mini=Integer.MAX_VALUE;

                for(int val:mpp.values()){
                    mini=Math.min(mini,val);
                    maxi=Math.max(maxi,val);
                }

                sum+=(maxi-mini);
            }
        }

        return sum;
    }
}
class Solution {
    public boolean hasSameDigits(String s) {
        int n=s.length();
        char[] ch = s.toCharArray();

        for(int i=1;i<=n-2;i++){
            for(int j=0;j<=n-1-i;j++){
                int first=ch[j]-'0';
                int second=ch[j+1]-'0';

                ch[j]= (char) (((first+second)%10)+'0');
            }
        }
        return ch[0]==ch[1];
    }
}
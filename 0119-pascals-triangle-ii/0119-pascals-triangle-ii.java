class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n=rowIndex;
        List<Integer> res = new ArrayList<>();

        for(int c=0;c<=n;c++){
            res.add(nCr(n,c));
        }

        return res;
    }

    public static int nCr(int n, int r){
        long res=1;

        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }

        return (int) res;
    }
}
class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        
        int celeb=0;
        
        for(int i=0;i<n;i++){
            if(mat[celeb][i]==1){
                celeb=i;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (i != celeb) {
                if (mat[celeb][i] == 1 || mat[i][celeb] == 0) {
                    return -1;
                }
            }
        }
        
        return celeb;
    }
}
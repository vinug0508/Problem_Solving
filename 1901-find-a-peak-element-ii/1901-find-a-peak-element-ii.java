class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        int low=0;
        int high=m-1;
        int[] ans = new int[2];

        while(low<=high){
            int mid=low+(high-low)/2;
            int rowMaxInd=findMaxIndex(mat, mid);

            int left=mid-1>=0? mat[rowMaxInd][mid-1]:-Integer.MIN_VALUE;
            int right=mid+1<m? mat[rowMaxInd][mid+1]:-Integer.MIN_VALUE;

            if(mat[rowMaxInd][mid]> left && mat[rowMaxInd][mid]>right){
                return new int[]{rowMaxInd, mid};
            }else if(mat[rowMaxInd][mid] < left){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return new int[]{-1,-1};
    }

    private int findMaxIndex(int[][]mat, int col){
        int n=mat.length;
        int maxValue=Integer.MIN_VALUE;
        int ind=-1;

        for(int i=0;i<n;i++){
            if(mat[i][col]>maxValue){
                maxValue=mat[i][col];
                ind=i;
            }
        }
        return ind;
    }
}
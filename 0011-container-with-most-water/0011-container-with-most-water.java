class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int ans=0;
        int left=0;
        int right=n-1;

        while(left<right){
            int area = Math.min(height[left],height[right])*(right-left);
            ans = Math.max(area,ans);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }

        return ans;
    }
}
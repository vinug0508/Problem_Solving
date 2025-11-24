class Solution {
    public int averageValue(int[] nums) {
        int ans=0;
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(n%2==0 && n%3==0){
                list.add(n);
            }
        }

        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        if(list.size()==0) return 0;
        return sum/list.size();
    }
}
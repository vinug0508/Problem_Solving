class Solution {
    public int minMaxGame(int[] nums) {
        int n=nums.length;
        List<Integer> currNums = new ArrayList<>();
        for(int num:nums){
            currNums.add(num);
        }

        while(currNums.size()>1){
            List<Integer> newNums = new ArrayList<>();

            for(int i=0;i<currNums.size()/2;i++){
                if(i%2==0){
                    int number=Math.min(currNums.get(2 * i), currNums.get(2 * i + 1));
                    newNums.add(number);
                }else{
                    int number1=Math.max(currNums.get(2 * i), currNums.get(2 * i + 1));
                    newNums.add(number1);
                }
            }

            currNums=newNums;
        }

        return currNums.get(0);
    }
}
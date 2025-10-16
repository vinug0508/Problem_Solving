class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int num:nums){
            // checking for negative numbers
            int mod=((num%value)+value)%value;
            mpp.put(mod, mpp.getOrDefault(mod,0)+1);
        }

        int mex=0;
        while(true){
            int mod=mex%value;
            if(mpp.getOrDefault(mod,0)>0){
                mpp.put(mod, mpp.get(mod)-1);
                mex++;
            }else{
                break;
            }
        }
        int ans=mex;

        return ans;

    }
}

/*
nums = [1, -10, 7, 13, 6, 8], value = 5
mod classes: [1, 0, 2, 3, 1, 3]
count = {0:1, 1:2, 2:1, 3:2}

Try mex = 0 → 0 % 5 = 0 → count[0] = 1 → use it
mex = 1 → 1 % 5 = 1 → count[1] = 2 → use it
mex = 2 → 2 % 5 = 2 → count[2] = 1 → use it
mex = 3 → 3 % 5 = 3 → count[3] = 2 → use it
mex = 4 → 4 % 5 = 4 → count[4] = 0 → STOP

Answer: 4

 */
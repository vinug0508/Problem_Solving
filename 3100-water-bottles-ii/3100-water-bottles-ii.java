class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans=0;

        int div=numBottles/numExchange;
        ans=numBottles+div;

        return ans;
    }
}
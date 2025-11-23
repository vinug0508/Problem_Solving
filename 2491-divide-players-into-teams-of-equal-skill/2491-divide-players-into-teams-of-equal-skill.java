class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        long ans=0;
        int teamSkill=skill[0]+skill[n-1];

        for(int i=0;i<n/2;i++){
            int currTeamSkill=skill[i]+skill[n-i-1];

            if(currTeamSkill!=teamSkill) return -1;

            ans+=(long)skill[i] * (long)skill[n-i-1];
        }

        return ans;
    }
}
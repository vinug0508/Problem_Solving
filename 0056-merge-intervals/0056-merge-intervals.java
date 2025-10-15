class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;

        Arrays.sort(intervals, (a,b)->a[0]-b[0]);

        List<int[]> ans = new ArrayList<>();

        int start=intervals[0][0];
        int end=intervals[0][1];

        for(int i=1;i<n;i++){
            // if merged interval
            if(intervals[i][0]<=end){
                end=Math.max(end, intervals[i][1]);
            }else{ // no overlap
                ans.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        // we are adding last interval
        ans.add(new int[]{start, end});

        // convert arraylist into 2d array
        return ans.toArray(new int[ans.size()][]);
    }
}
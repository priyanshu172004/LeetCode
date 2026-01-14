class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        int last = intervals[0][1];
        int count = 0;
        for(int i = 1; i < intervals.length; i++){
            if(last > intervals[i][0]){
                count++;
            }else{
                last = intervals[i][1];
            }
        }
        return count;
    }
}
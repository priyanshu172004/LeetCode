class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval){
        int[][] newArray = new int[intervals.length + 1][2];
        for(int i = 0; i < intervals.length; i++){
            newArray[i] = intervals[i];
        }
        newArray[intervals.length] = newInterval;

        Arrays.sort(newArray, (a,b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> result = new ArrayList<>();
        result.add(new int[]{newArray[0][0], newArray[0][1]});


        for(int i = 1; i < newArray.length; i++){
            int[] last = result.get(result.size() - 1);
            int[] current = newArray[i];
            if(current[0] <= last[1]){
                last[1] = Math.max(last[1], current[1]);
            }else{
                result.add(new int[]{current[0], current[1]});
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
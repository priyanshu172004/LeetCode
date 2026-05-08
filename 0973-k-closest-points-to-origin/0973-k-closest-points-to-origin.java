class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a,b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1])
        );
        for(int[] i : points){
            minHeap.add(i);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int[][] result = new int[k][2];
        int j = 0;
        while(!minHeap.isEmpty()){
            result[j++] = minHeap.poll();
        }
        return result;
    }
}
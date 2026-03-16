class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = nums1.length;
        int[][] pairs = new int[n][2];
        for(int i = 0; i < n; i++){
            pairs[i][0] = nums2[i];
            pairs[i][1] = nums1[i];
        }
        Arrays.sort(pairs, (a,b) -> b[0] - a[0]);
        long sum = 0;
        long maxSum = 0;
        for(int[] p : pairs){
            int n2 = p[0];
            int n1 = p[1];
            minHeap.add(n1);
            sum += n1;
            if(minHeap.size() > k){
                sum -= minHeap.poll();
            }
            if(minHeap.size() == k){
                maxSum = Math.max(maxSum, sum * n2);
            }
        }
        return maxSum;
    }
}
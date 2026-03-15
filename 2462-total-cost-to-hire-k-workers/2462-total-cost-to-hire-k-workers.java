class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        int i = 0;
        int j = costs.length - 1;
        PriorityQueue<Integer> leftHeap = new PriorityQueue<>();
        PriorityQueue<Integer> rightHeap = new PriorityQueue<>();
        for(int cost = 0; cost < candidates && i <= j; cost++){
            leftHeap.add(costs[i++]);
            if(i <= j){
                rightHeap.add(costs[j--]);
            }
        }
        long totalCost = 0;
        for(int hire = 0; hire < k; hire++){
            int leftMin = leftHeap.isEmpty() ? Integer.MAX_VALUE : leftHeap.peek();
            int rightMin = rightHeap.isEmpty() ? Integer.MAX_VALUE : rightHeap.peek();

            if(leftMin <= rightMin){
                totalCost += leftHeap.poll();
                if(i <= j){
                    leftHeap.add(costs[i++]);
                }
            }else{
                totalCost += rightHeap.poll();
                if(i <= j){
                    rightHeap.add(costs[j--]);
                }
            }
        }
        return totalCost;
    }
}
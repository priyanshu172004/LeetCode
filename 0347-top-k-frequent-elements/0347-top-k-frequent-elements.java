class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(map.get(b), map.get(a))
        );
        for(int key : map.keySet()){
            pq.add(key);
        }
        for(int i = 0; i < k; i++){
            result[i] = pq.poll();
        }
        return result;
    }
}
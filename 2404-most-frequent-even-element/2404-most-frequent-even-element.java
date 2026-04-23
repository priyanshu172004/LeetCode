class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int ans = -1;
        int maxFreq = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(key % 2 == 0){
                if(value > maxFreq){
                    maxFreq = value;
                    ans = key;
                }
            }
        }
        return ans;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n= nums.length;
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > n/3){
                result.add(key);
            }
        }
        return result;
    }
}
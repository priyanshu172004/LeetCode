class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int item : nums){
            map.put(item, map.getOrDefault(item, 0) + 1);
            if(map.get(item) > 1){
                return item;
            }
        }
        return 0;
    }
}
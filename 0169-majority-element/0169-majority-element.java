class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int max = 0;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(map.get(i) > max){
                res = i;
                max = map.get(i);
            }
        }
        return res;
    }
}
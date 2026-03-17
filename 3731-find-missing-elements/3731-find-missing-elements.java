class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int min = nums[0];
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            if(i > max){
                max = i;
            }
        }
        for(int i : nums){
            if(i < min){
                min = i;
            }
        }
        for(int i = min; i <= max; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
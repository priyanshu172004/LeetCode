class Solution {
    public int missingInteger(int[] nums) {
        int minSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1] + 1){
                minSum += nums[i];
            }else{
                break;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        while (set.contains(minSum)) {
            minSum++;
        }
        return minSum;
    }
}
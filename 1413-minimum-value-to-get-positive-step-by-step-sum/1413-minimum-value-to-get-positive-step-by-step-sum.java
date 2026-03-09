class Solution {
    public int minStartValue(int[] nums) {
        int prefixSum = 0;
        int minSum = 0;
        for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];
            minSum = Math.min(minSum, prefixSum);
        }
        int count = 0;
        while(minSum != 1){
            minSum++;
            count++;
        }
        return count;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int currSum = 0;
        for(int i : nums){
            currSum += i;
        }
        int nSum = (n * (n + 1)) / 2;
        return nSum - currSum;
    }
}
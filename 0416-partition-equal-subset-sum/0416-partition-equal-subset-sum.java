class Solution {
    public static boolean findIfTargetExists(int n, int target, int[] nums, int[][] dp){
        if(target == 0){
            return true;
        }
        if(n == 0){
            return nums[0] == target;
        }
        if(dp[n][target] != -1){
            return dp[n][target] == 1;
        }
        boolean notPick = findIfTargetExists(n - 1, target, nums, dp);
        boolean pick = false;
        if(nums[n] <= target){
            pick = findIfTargetExists(n - 1, target - nums[n], nums, dp);
        }
        dp[n][target] = (pick || notPick) ? 1 : 0;
        return dp[n][target] == 1;
    }
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }
        if(totalSum % 2 != 0){
            return false;
        }
        int sum = totalSum/2;
        int[][] dp = new int[nums.length + 1][sum + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return findIfTargetExists(nums.length - 1, sum, nums, dp);
    }
}
class Solution {
    public static boolean findIfTargetExists(int n, int target, int[] nums){
        int[][] dp = new int[n + 1][target + 1];
        if(target == 0){
            for(int i = 0; i <= n; i++){
                dp[i][0] = 1;
            }
            return true;
        }
        if(nums[0] <= target){
            dp[0][nums[0]] = 1;
        }
        for(int i = 1; i <= n; i++){
            for(int tar = 1; tar <= target; tar++){
                boolean notPick = (dp[i - 1][tar] == 1);
                boolean pick = false;
                if(nums[i] <= tar){
                    pick = (dp[i - 1][tar - nums[i]] == 1);
                }
                dp[i][tar] = (pick || notPick) ? 1 : 0;
            }
        }
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
        return findIfTargetExists(nums.length - 1, sum, nums);
    }
}
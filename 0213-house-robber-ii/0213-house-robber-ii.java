class Solution {
    public int helper(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int i = 1; i < n; i++){
            int pick = nums[i];
            if(i > 1){
                pick += dp[i - 2];
            }
            int notPick = dp[i - 1];
            dp[i] = Math.max(pick, notPick);
        }
        return dp[n - 1];
    }
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int[] arr1 = new int[nums.length - 1];
        int[] arr2 = new int[nums.length - 1];
        for(int i = 0; i < nums.length - 1; i++){
            arr1[i] = nums[i];
        }
        for(int i = 1; i < nums.length; i++){
            arr2[i - 1] = nums[i];
        }
        return Math.max(helper(arr1), helper(arr2));
    }
}
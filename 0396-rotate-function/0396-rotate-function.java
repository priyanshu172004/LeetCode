class Solution {

    public int maxRotateFunction(int[] nums) {

        int n = nums.length;

        long totalSum = 0;
        long[] dp = new long[n];

        // Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        // Calculate F(0)
        long f0 = 0;

        for (int i = 0; i < n; i++) {
            f0 += (long)i * nums[i];
        }

        dp[0] = f0;

        long max = dp[0];

        // DP transition
        for (int k = 1; k < n; k++) {

            dp[k] = dp[k - 1] + totalSum - (long)n * nums[n - k];

            max = Math.max(max, dp[k]);
        }

        return (int)max;
    }
}
class Solution {

    Integer[][][] dp;

    public int findScore(int[][] grid, int row, int col, int k) {
        int m = grid.length, n = grid[0].length;

        if (row >= m || col >= n) return Integer.MIN_VALUE;

        int val = grid[row][col];

        int cost = (val == 0) ? 0 : 1;
        int score = val;
        if (k < cost) return Integer.MIN_VALUE;
        if (row == m - 1 && col == n - 1) {
            return score;
        }

        if (dp[row][col][k] != null) return dp[row][col][k];

        int right = findScore(grid, row, col + 1, k - cost);
        int down = findScore(grid, row + 1, col, k - cost);

        int maxNext = Math.max(right, down);

        if (maxNext == Integer.MIN_VALUE) {
            return dp[row][col][k] = Integer.MIN_VALUE;
        }

        return dp[row][col][k] = score + maxNext;
    }

    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;

        dp = new Integer[m][n][k + 1];
        int ans = findScore(grid, 0, 0, k);
        return ans == Integer.MIN_VALUE ? -1 : ans;
    }
}